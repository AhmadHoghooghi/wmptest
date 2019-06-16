angular.module('wmptest.tag')
    .factory('TagResource', ['$resource', 'wmptestResourceService', function ($resource, wmptestResourceService) {
      return $resource('', {}, wmptestResourceService.create('tag'));
    }]);
