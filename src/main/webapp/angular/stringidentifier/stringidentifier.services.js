angular.module('wmptest.stringidentifier')
    .factory('StringidentifierResource', ['$resource', 'wmptestResourceService', function ($resource, wmptestResourceService) {
      return $resource('', {}, wmptestResourceService.create('stringIdentifier'));
    }]);
