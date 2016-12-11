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
                durationInMinutes: 5,
                audienceEnjoyment: 2,
                technicalDifficulty: 10,
                playingFunLevel: 10
            }
        ];

        $scope.playingSlot = { totalAllocatedSlot: 30 };

        $scope.job = {
            running: false,
            submitted: false
        };

        function add() {
            $scope.songs.push({
                name: '',
                durationInMinutes: 5,
                audienceEnjoyment: 0,
                technicalDifficulty: 0,
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
