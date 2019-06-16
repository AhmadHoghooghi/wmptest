angular.module('wmptest.filecontainer')
    .factory('FilecontainerResource', ['$resource', 'wmptestResourceService', function ($resource, wmptestResourceService) {
      return $resource('', {}, wmptestResourceService.create('fileContainer'));
    }]);
