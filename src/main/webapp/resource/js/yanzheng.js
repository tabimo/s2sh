var mdaxueLoad=function(){
	this.getload=function(main,depart,url){		
		if(depart!=""){			
			jQuery("#"+main).load(url+" #"+depart);//取查询结果的部分数据			
		}else{				
			jQuery("#"+main).load(url,function(responseText,textStatus,XMLHttpRequest){	
				
			});//将查询结果完全访问到容器中			
		}
	};
	this.getcomload=function(main,url,args){	
		jQuery("#"+main).load(url,args,function(responseText,textStatus,XMLHttpRequest){
			
		});
	};
	this.postload=function(main,depart,params,url){
			jQuery("#"+main).load(url+" #"+depart,params,function(){
		});
	};
};
function reload() {
	setTimeout(function(){
		window.location.reload();
	},1000);
}
var SpringAjax=function(){
	this.postAjax=function(params,link){
		$.post(
				link,
				params,
				function(message){	
					if(message!=0){
						alert("操作成功");
						reload();
					}else{
						alert("操作失败");
					}
				}
		);
		return false;
	};
	this.postNoReturnAjax=function(params,link){
		$.post(
				link,
				params,
				function(){
					reload();
				}
		);
		return false;
	};
};
