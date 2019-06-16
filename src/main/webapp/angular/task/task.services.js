angular.module('wmptest.task')
    .factory('TaskResource', ['$resource', 'wmptestResourceService', function ($resource, wmptestResourceService) {
      return $resource('', {}, wmptestResourceService.create('task'));
    }]);
