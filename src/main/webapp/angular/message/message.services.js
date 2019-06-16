angular.module('wmptest.message')
    .factory('MessageResource', ['$resource', 'wmptestResourceService', function ($resource, wmptestResourceService) {
      return $resource('', {}, wmptestResourceService.create('message'));
    }]);
