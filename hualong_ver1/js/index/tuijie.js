mui.init();
var btn_submit;
var tui_name;
var tui_sex;
var tui_phone;
var tui_mj;
var tui_time;
var tui_bz;

mui.plusReady(function() {
	storage.init();
	btn_submit = document.getElementById("verify");
	tui_name = document.getElementById("tui_name");
	tui_sex = document.getElementById("tui_sex");
	tui_phone = document.getElementById("tui_phone");
	tui_mj = document.getElementById("tui_mj");
	tui_time = document.getElementById("tui_time");
	//	tui_bz=document.getElementById("tui_bz");
	//注册
	btn_submit.addEventListener('click', function() {
		appUI.setDisabled(btn_submit);
		var data = {
			"cusName": tui_name.value,
			"cusSex": tui_sex.options[tui_sex.selectedIndex].value,
			"cusPhone": tui_phone.value,
			"cusArea": tui_mj.value,
			"cusDate": tui_time.value,
			"cusUserid": storageUser.userId
			//			"cusBz":tui_bz.value
		}
		request("/addCus", data, function(json) {
			appUI.removeDisabled(btn_submit);
			mui.toast(json.message);
			if(json.status == "success") {
				console.debug("????");
				mui.back();
			}
		}, true, function() {
			appUI.removeDisabled(btn_submit);
		});
	});

})