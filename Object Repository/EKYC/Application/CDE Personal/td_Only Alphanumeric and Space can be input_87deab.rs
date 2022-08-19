<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>td_Only Alphanumeric and Space can be input_87deab</name>
   <tag></tag>
   <elementGuidId>cdeab99a-b23c-4139-ba2a-387e1ad5fa3b</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='dMain']/table/tbody/tr/td[4]</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value></value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>td</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>width</name>
      <type>Main</type>
      <value>30%</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>tdValue</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                                        
                                        Only Alphanumeric and Space can be inputed
                                        This Field is Required
                                        Minimum Birth Place length is 3
                                        
                                            *
                                        
                                        ,
                                        

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



                                        
                                            *
                                        
                                    </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;dMain&quot;)/table[@class=&quot;formTable&quot;]/tbody[1]/tr[1]/td[@class=&quot;tdValue&quot;]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>ref_element</name>
      <type>Main</type>
      <value>Object Repository/EKYC/Application/CDE Personal/iframe_Welcome, TITO ARI PRABOWO, AREA 2, C_85b3dc</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='dMain']/table/tbody/tr/td[4]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='*'])[1]/following::td[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)=concat('Only Space, Alphabet and - . ', &quot;'&quot;, ' can be inputed')])[1]/following::td[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>//*/text()[normalize-space(.)=',']/parent::*</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//td[4]</value>
   </webElementXpaths>
</WebElementEntity>
