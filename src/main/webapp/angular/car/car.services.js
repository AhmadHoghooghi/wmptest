angular.module('wmptest.car')
    .factory('CarResource', ['$resource', 'wmptestResourceService', function ($resource, wmptestResourceService) {
      return $resource('', {}, wmptestResourceService.create('car'));
    }]);
