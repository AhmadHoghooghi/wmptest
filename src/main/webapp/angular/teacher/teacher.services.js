angular.module('wmptest.teacher')
    .factory('TeacherResource', ['$resource', 'wmptestResourceService', function ($resource, wmptestResourceService) {
      return $resource('', {}, wmptestResourceService.create('teacher'));
    }]);
