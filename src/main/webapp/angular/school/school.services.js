angular.module('wmptest.school')
    .factory('SchoolResource', ['$resource', 'wmptestResourceService', function ($resource, wmptestResourceService) {
      return $resource('', {}, wmptestResourceService.create('school'));
    }]);
