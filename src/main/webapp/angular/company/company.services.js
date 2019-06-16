angular.module('wmptest.company')
    .factory('CompanyResource', ['$resource', 'wmptestResourceService', function ($resource, wmptestResourceService) {
      return $resource('', {}, wmptestResourceService.create('company'));
    }]);
