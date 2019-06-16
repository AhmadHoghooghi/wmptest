angular.module('wmptest.teacher')
    .controller('TeacherEditCtrl', ['$scope', 'TeacherResource', 'wmptestControllerService', function ($scope, TeacherResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyEditCtrl($scope,'teacher', TeacherResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('TeacherListCtrl', ['$scope', 'TeacherResource', 'wmptestControllerService', function ($scope, TeacherResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyListCtrl($scope,'teacher', TeacherResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('TeacherDisplayCtrl', ['$scope', '$location', '$routeParams', 'TeacherResource', 'wmptestControllerService', function ($scope, $location, $routeParams, TeacherResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
      wmptestControllerService.applyDisplayCtrl($scope,'teacher', TeacherResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
