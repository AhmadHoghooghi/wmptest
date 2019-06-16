angular.module('wmptest.kitchen')
    .factory('KitchenResource', ['$resource', 'wmptestResourceService', function ($resource, wmptestResourceService) {
      return $resource('', {}, wmptestResourceService.create('kitchen'));
    }]);
