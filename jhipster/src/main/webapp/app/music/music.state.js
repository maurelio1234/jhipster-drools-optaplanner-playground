(function() {
    'use strict';

    angular
        .module('jhipsterApp')
        .config(stateConfig);

    stateConfig.$inject = ['$stateProvider'];

    function stateConfig($stateProvider) {
        $stateProvider.state('music', {
            parent: 'app',
            url: '/music',
            data: {
            },
            views: {
                'content@': {
                    templateUrl: 'app/music/music.html',
                    controller: 'MusicController',
                    controllerAs: 'vm'
                }
            }
        });
    }
})();
