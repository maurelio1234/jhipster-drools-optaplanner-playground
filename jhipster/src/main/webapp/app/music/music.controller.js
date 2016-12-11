(function() {
    'use strict';

    angular
        .module('jhipsterApp')
        .controller('MusicController', MusicController);

    MusicController.$inject = ['$scope'];

    function MusicController ($scope) {
        var vm = this;
        vm.add = add;
        vm.remove = remove;

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
    }
})();
