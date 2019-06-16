angular.module('wmptest.engine')
    .factory('EngineResource', ['$resource', 'wmptestResourceService', function ($resource, wmptestResourceService) {
      return $resource('', {}, wmptestResourceService.create('engine'));
    }]);
