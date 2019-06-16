angular.module('wmptest.employee')
    .factory('EmployeeResource', ['$resource', 'wmptestResourceService', function ($resource, wmptestResourceService) {
      return $resource('', {}, wmptestResourceService.create('employee'));
    }]);
