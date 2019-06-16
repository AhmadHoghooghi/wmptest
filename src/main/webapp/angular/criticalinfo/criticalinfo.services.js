angular.module('wmptest.criticalinfo')
    .factory('CriticalinfoResource', ['$resource', 'wmptestResourceService', function ($resource, wmptestResourceService) {
      return $resource('', {}, wmptestResourceService.create('criticalInfo'));
    }]);
