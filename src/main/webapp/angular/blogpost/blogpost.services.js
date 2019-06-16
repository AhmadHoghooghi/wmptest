angular.module('wmptest.blogpost')
    .factory('BlogpostResource', ['$resource', 'wmptestResourceService', function ($resource, wmptestResourceService) {
      return $resource('', {}, wmptestResourceService.create('blogPost'));
    }]);
