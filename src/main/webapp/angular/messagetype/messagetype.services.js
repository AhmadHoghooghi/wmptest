angular.module('wmptest.messagetype')
    .factory('MessagetypeResource', ['$resource', 'wmptestResourceService', function ($resource, wmptestResourceService) {
      return $resource('', {}, wmptestResourceService.create('messageType'));
    }]);
