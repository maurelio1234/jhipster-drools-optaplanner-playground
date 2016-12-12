(function() {
    'use strict';

    angular
        .module('jhipsterApp')
        .controller('MusicController', MusicController);

    MusicController.$inject = ['$scope', '$http', '$timeout'];

    function MusicController ($scope, $http, $timeout) {
        var vm = this;
        vm.add = add;
        vm.remove = remove;
        vm.submit = submit;

        $scope.songs = [
            {
                name: 'Sweat child O\'mine',
                durationInMinutes: 6,
                audienceEnjoyment: 7,
                technicalDifficuty: 9,
                playingFunLevel: 8
            },
            {
                name: 'Thank you',
                durationInMinutes: 3,
                audienceEnjoyment: 5,
                technicalDifficuty: 5,
                playingFunLevel: 6
            },
            {
                name: 'Save tonight',
                durationInMinutes: 3,
                audienceEnjoyment: 7,
                technicalDifficuty: 2,
                playingFunLevel: 10
            },
            {
                name: 'Sweet dreams',
                durationInMinutes: 4,
                audienceEnjoyment: 5,
                technicalDifficuty: 3,
                playingFunLevel: 3
            },
            {
                name: 'I\'m yours',
                durationInMinutes: 9,
                audienceEnjoyment: 10,
                technicalDifficuty: 3,
                playingFunLevel: 10
            },
            {
                name: 'Lemon tree',
                durationInMinutes: 3,
                audienceEnjoyment: 8,
                technicalDifficuty: 4,
                playingFunLevel: 3
            },
            {
                name: 'Wonderwall',
                durationInMinutes: 5,
                audienceEnjoyment: 4,
                technicalDifficuty: 4,
                playingFunLevel: 3
            },
            {
                name: 'Pretty woman',
                durationInMinutes: 3,
                audienceEnjoyment: 6,
                technicalDifficuty: 3,
                playingFunLevel: 1
            },
            {
                name: 'Creep',
                durationInMinutes: 4,
                audienceEnjoyment: 4,
                technicalDifficuty: 1,
                playingFunLevel: 1
            },
        ];

        $scope.playingSlot = { totalAllocatedSlot: 15 };

        $scope.job = {
            running: false,
            submitted: false
        };

        function add() {
            $scope.songs.push({
                name: '',
                durationInMinutes: 5,
                audienceEnjoyment: 0,
                technicalDifficuty: 0,
                playingFunLevel: 0
            });
        }

        function remove(index) {
            $scope.songs.splice(index, 1)
        }

        function submit() {
            $http.post('api/jobs', {songs: $scope.songs, totalAllocatedSlot: $scope.playingSlot.totalAllocatedSlot})
                .success(function(data) {
                    $scope.job.id = data.jobId;
                    $scope.job.running = true;
                    $scope.job.submitted = true;
                    $scope.job.songs = [];

                    $timeout(checkJob, 5000);
                })
        }

        function checkJob() {
            $http.get('api/jobs/' + $scope.job.id)
                .success(function(data) {
                    $scope.job.running = !data.finished;
                    $scope.job.songs = data.songNames;

                    if ($scope.job.running) {
                        $timeout(checkJob, 5000);
                    }
                })
        }
    }
})();
