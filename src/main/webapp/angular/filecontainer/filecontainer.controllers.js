angular.module('wmptest.filecontainer')
    .controller('FilecontainerEditCtrl', ['$scope', 'FilecontainerResource', 'wmptestControllerService', function ($scope, FilecontainerResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyEditCtrl($scope,'fileContainer', FilecontainerResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('FilecontainerListCtrl', ['$scope', 'FilecontainerResource', 'wmptestControllerService', function ($scope, FilecontainerResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyListCtrl($scope,'fileContainer', FilecontainerResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('FilecontainerDisplayCtrl', ['$scope', '$location', '$routeParams', 'FilecontainerResource', 'wmptestControllerService', function ($scope, $location, $routeParams, FilecontainerResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
      wmptestControllerService.applyDisplayCtrl($scope,'fileContainer', FilecontainerResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
