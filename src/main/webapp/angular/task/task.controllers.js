angular.module('wmptest.task')
    .controller('TaskEditCtrl', ['$scope', 'TaskResource', 'wmptestControllerService', function ($scope, TaskResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyEditCtrl($scope,'task', TaskResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('TaskListCtrl', ['$scope', 'TaskResource', 'wmptestControllerService', function ($scope, TaskResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
     	wmptestControllerService.applyListCtrl($scope,'task', TaskResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('TaskDisplayCtrl', ['$scope', '$location', '$routeParams', 'TaskResource', 'wmptestControllerService', function ($scope, $location, $routeParams, TaskResource, wmptestControllerService) {
      var loading = $.fn.showLoading();
    	wmptestControllerService.init($scope);
      wmptestControllerService.applyDisplayCtrl($scope,'task', TaskResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
