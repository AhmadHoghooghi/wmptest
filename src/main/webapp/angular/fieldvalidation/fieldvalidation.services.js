angular.module('wmptest.fieldvalidation')
    .factory('FieldvalidationResource', ['$resource', 'wmptestResourceService', function ($resource, wmptestResourceService) {
      return $resource('', {}, wmptestResourceService.create('fieldValidation'));
    }]);
