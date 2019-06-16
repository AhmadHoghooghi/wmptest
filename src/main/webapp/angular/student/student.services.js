angular.module('wmptest.student')
    .factory('StudentResource', ['$resource', 'wmptestResourceService', function ($resource, wmptestResourceService) {
      return $resource('', {}, wmptestResourceService.create('student'));
    }]);
