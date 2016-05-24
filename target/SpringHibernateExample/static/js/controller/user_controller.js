'use strict';
App.controller('UserController', ['$scope', 'UserService', function($scope, UserService) {
          var self = this;
          self.user={id:null,name:'',source:'',destination:''};
          self.users=[];
          self.result=[];
           self.flight1={id:null,DayTimeDep:'',src:'',dest:''};   
          self.fetchAllUsers = function(){
              UserService.fetchAllUsers()
                  .then(
      					       function(d) {
      						        self.users = d;
      					       },
            					function(errResponse){
            						console.error('Error while fetching Currencies');
            					}
      			       );
          };
           
          self.createUser = function(user){
             console.log('Creating New User with name:'+self.user.name);  
                UserService.createUser(user)
		              .then(
                      self.fetchAllUsers, 
				              function(errResponse){
					               console.error('Error while creating User.');
				              }	
                  );
          };
          
          self.find_flight = function(source){
             console.log('finding New User with name:'+source);  
                UserService.find_flight(source)
		              .then(
                       function(d) {
      						        self.result = d;
      					       },
				              function(errResponse){
					               console.error('Error while finding User.');
				              }	
                  );
          };

         self.updateUser = function(user, id){
              UserService.updateUser(user, id)
		              .then(
				              self.fetchAllUsers, 
				              function(errResponse){
					               console.error('Error while updating User.');
				              }	
                  );
          };

         self.deleteUser = function(id){
              UserService.deleteUser(id)
		              .then(
				              self.fetchAllUsers, 
				              function(errResponse){
					               console.error('Error while deleting User.');
				              }	
                  );
          };

         // self.fetchAllUsers();

          self.submit = function() {
              if(self.user.id==null){
                  console.log('Saving New User with name:'+self.user.name, self.user);  
                //  self.fetchAllUsers();
                  self.createUser(self.user);
              }else{
                  self.updateUser(self.user, self.user.id);
                  console.log('User updated with id ', self.user.id);
              }
              self.reset();
          };
              
          self.edit = function(id){
              console.log('id to be edited', id);
              for(var i = 0; i < self.users.length; i++){
                  if(self.users[i].id == id) {
                     self.user = angular.copy(self.users[i]);
                     break;
                  }
              }
          };
              
          self.remove = function(id){
              console.log('id to be deleted', id);
              if(self.user.id === id) {//clean form if the user to be deleted is shown there.
                 self.reset();
              }
              self.deleteUser(id);
          };

          
          self.reset = function(){
              self.user={id:null,name:'',src:'',dest:''};
              $scope.myForm.$setPristine(); //reset Form
          };


self.find = function() {
              
                  console.log('finding New flight with name:'+ self.flight1.src);  
                 self.find_flight(self.flight1.src);
                  //self.createUser(self.user);
              
          };
      }]);
