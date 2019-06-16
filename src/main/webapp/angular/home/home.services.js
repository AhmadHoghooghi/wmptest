angular.module('wmptest.home')
    .factory('HomeResource', ['$resource', 'wmptestResourceService', function ($resource, wmptestResourceService) {
      return $resource('', {}, wmptestResourceService.create('home'));
    }]);
