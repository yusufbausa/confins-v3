<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_katalonfont-familymonospacefont-size13_6a6dcb</name>
   <tag></tag>
   <elementGuidId>28e85aa0-8646-4f7c-84e9-7474d86bb2bc</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//*/text()[normalize-space(.)='']/parent::*</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>html</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>html</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xmlns</name>
      <type>Main</type>
      <value>http://www.w3.org/1999/xhtml</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>

#katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} div#katalon-spy_elementInfoDiv {color: lightblue; padding: 0px 5px 5px} div#katalon-spy_instructionDiv {padding: 5px 5px 2.5px}

    







//&lt;![CDATA[
var theForm = document.forms['form1'];
if (!theForm) {
    theForm = document.form1;
}
function __doPostBack(eventTarget, eventArgument) {
    if (!theForm.onsubmit || (theForm.onsubmit() != false)) {
        theForm.__EVENTTARGET.value = eventTarget;
        theForm.__EVENTARGUMENT.value = eventArgument;
        theForm.submit();
    }
}
//]]>

















	
	

    
        
//&lt;![CDATA[
Sys.WebForms.PageRequestManager._initialize('smColl', 'form1', ['tupPath','upPath','tupToolbar','upToolbar','tupSearch','upSearch','fucSearch$upFixedSearch','ucSearch_upFixedSearch','fucSearch$upWfPagingSearch','ucSearch_upWfPagingSearch','fucSearch$upButton','ucSearch_upButton','tupPaging','upPaging','tupInfo','upInfo','fupReceiptForm','upReceiptForm','tupInput','upInput'], [], [], 90, '');
//]]>


        
	
                
                    Remedial/Repossession/InventorySellingReceive
                
            

        
                
                    
                        
                            INVENTORY SELLING RECEIVE
                        
                    
                        Submit
                       
                        
                       
                        Cancel
                    
                
            
        
            
                    
                
            

                
                    
                
            
                    
                        
                            

    
        [-]
    AGREEMENT INFO


                            
                                
                                    
                                        
                                            Office
                                        
                                        
                                            0001-JAKARTA CENTRAL
                                        
                                        
                                            Agreement No
                                        
                                        
                                            1911340873
                                        
                                    
                                    
                                        
                                            Customer Name
                                        
                                        
                                            IRPAN
                                        
                                    
                                
                            
                        
                        
                            
    

    
        [-]
    AGREEMENT ASSET INFO


    
        
            
                
                    Asset Description
                    
                    
                
                
                    TOYOTA CALYA B 40 G M/T
                
                
                    No. Mesin
                
                
                    3NRH437587
                
            
            
                
                    License Plate
                
                
                    B 2914 SIK
                
                
                    No. Rangka
                
                
                    MHKA6GJ6JKJ124041
                
            
             
                
                    Asset Status
                
                
                    Inventory
                
            
        
    


                        
                        
                    
                
            
                    
                    
                
            
                    
                        

    
        [-]
    PAYMENT DETAIL


                        
                            
                                
                                    
                                        Receive From
                                    
                                    
                                        *
                                        Receive From must be filled
                                    
                                    
                                        Reference No
                                    
                                    
                                        *
                                        Reference No must be filled
                                    
                                
                                
                                    
                                        Way Of Payment
                                    
                                    
                                        
	Select One
	Bank
	Cash


This field is required




                                        
                                    
                                    
                                        Value Date
                                    
                                    
                                        

    function copy(from, to, rvid) {
        var value = document.getElementById(from).value;

        if (value != '') {
            var split = value.split('/');
            $('#' + to).val(split[1] + '/' + split[0] + '/' + split[2]);
            $('#' + from).val(split[0] + '/' + split[1] + '/' + split[2]);
        }
        else {
            $('#' + to).val(value);
        }
        var rv = document.getElementById(rvid);
        ValidatorValidate(rv);
    }



Invalid Date
This field is required
    
Value must be Date Format



                                    
                                
                                
                                    
                                        Bank Account
                                    
                                    
                                        
	Select One
	013-(JF) BP9081-IDR-0701859081
	014-(PAY) BC1710-IDR-0353171710
	013-(PAY) BP8080-IDR-07012088080
	067-(PAY) DB5001-IDR-0050005001
	013-(PAY) PS6226-IDR-0701596226
	013-(RCV) BP6060-IDR-07012066060
	013-(RCV) BP7070-IDR-07012077070
	014-BC7603-IDR-0353087603
	008-BM5552-IDR-1240055555552
	008-BM8882-IDR-1240055688882
	008-BM8888-IDR-1130007078888
	009-BN0002-IDR-7000700002
	013-BP1010-IDR-07012011010
	013-BP5050-IDR-07012055050
	013-BP6088-IDR-0902136088
	013-BP9090-IDR-07012099090
	002-BR0302-IDR-037801000740302
	011-DA9952-IDR-53969952
	067-DB5000-IDR-0050005000
	067-DB5002-IDR-0050005002
	067-DB5003-IDR-0050005003


This field is required




                                    
                                    
                                        Selling Amount
                                    
                                    
                                        




    




This field is required
*

*


    function validateKey(evt) {
        var charCode = (evt.which) ? evt.which : event.keyCode
        if (charCode > 31 &amp;&amp; (charCode &lt; 48 || charCode > 57) &amp;&amp; (charCode != 45 &amp;&amp; charCode != 44 &amp;&amp; charCode != 46))
            return false;

        return true;
    }


                                    
                                
                                
                                
                                    
                                        Notes
                                    
                                    
                                        
                                    
                                    
                                    
                                    
                                    
                                
                            
                        
                    
                

            
            
            
            
            
        
    
    


	
        
            
                
                
                Loading
            
        
    




//&lt;![CDATA[
$('#uclReceiptFromAuto_ucReceiptForm_umd_ctl00_ucS_rptFixedSearch_ucDatePicker_0_txtDatePicker_0').datepicker({
                                                                                                                    changeMonth: true,
                                                                                                                    changeYear: true,
                                                                                                                    dateFormat: 'dd/mm/yy',
                                                                                                                    yearRange: '-100:+100'
                                                                                                                });$('#uclReceiptFromAuto_ucReceiptForm_umd_ctl00_ucS_rptFixedSearch_ucDatePicker_1_txtDatePicker_1').datepicker({
                                                                                                                    changeMonth: true,
                                                                                                                    changeYear: true,
                                                                                                                    dateFormat: 'dd/mm/yy',
                                                                                                                    yearRange: '-100:+100'
                                                                                                                });$('#ucdpValueDate_txtDatePicker').datepicker({
                                                                                                                    changeMonth: true,
                                                                                                                    changeYear: true,
                                                                                                                    dateFormat: 'dd/mm/yy',
                                                                                                                    yearRange: '-100:+100'
                                                                                                                });//]]>

ExpandUnexpandMenu('','dNewFinancialStructureSection', 'ucToggleNewFinancialStructure_subSectionID')ExpandUnexpandMenu('','dNewAmortization', 'ucToggleNewAmortization_subSectionID')ExpandUnexpandMenu('','dNewInst', 'ucTogglenIstallment_subSectionID')

//&lt;![CDATA[
Sys.Application.add_init(function() {
    $create(Sys.UI._UpdateProgress, {&quot;associatedUpdatePanelId&quot;:null,&quot;displayAfter&quot;:500,&quot;dynamicLayout&quot;:true}, null, null, $get(&quot;ucLoadingPanel_upProgress&quot;));
});
//]]>

PrevNextJanFebMarAprMayJunJulAugSepOctNovDec192119221923192419251926192719281929193019311932193319341935193619371938193919401941194219431944194519461947194819491950195119521953195419551956195719581959196019611962196319641965196619671968196919701971197219731974197519761977197819791980198119821983198419851986198719881989199019911992199319941995199619971998199920002001200220032004200520062007200820092010201120122013201420152016201720182019202020212022202320242025202620272028202920302031203220332034203520362037203820392040204120422043204420452046204720482049205020512052205320542055205620572058205920602061206220632064206520662067206820692070207120722073207420752076207720782079208020812082208320842085208620872088208920902091209220932094209520962097209820992100210121022103210421052106210721082109211021112112211321142115211621172118211921202121SuMoTuWeThFrSa12345678910111213141516171819202122232425262728293031    


/html[1]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>ref_element</name>
      <type>Main</type>
      <value>Object Repository/REMEDIAL/Inventory Selling/Inventory Selling Receive/iframe_Welcome, NOFRIANSYAH, HEAD OFFICE, F_fe9722</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>//*/text()[normalize-space(.)='']/parent::*</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//html</value>
   </webElementXpaths>
</WebElementEntity>
