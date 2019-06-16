angular.module('wmptest.student')
    .controller('StudentEditCtrl', ['$scope', 'StudentResource', 'wmptestControllerService', function ($scope, StudentResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyEditCtrl($scope,'student', StudentResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('StudentListCtrl', ['$scope', 'StudentResource', 'wmptestControllerService', function ($scope, StudentResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyListCtrl($scope,'student', StudentResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('StudentDisplayCtrl', ['$scope', '$location', '$routeParams', 'StudentResource', 'wmptestControllerService', function ($scope, $location, $routeParams, StudentResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
      wmptestControllerService.applyDisplayCtrl($scope,'student', StudentResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
