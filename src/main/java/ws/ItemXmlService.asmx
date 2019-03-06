<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://tempuri.org/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://tempuri.org/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://tempuri.org/">
      <s:element name="GetProducts">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="uname" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="upass" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GetProductsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="GetProductsResult" type="tns:ArrayOfProducts" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:complexType name="ArrayOfProducts">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="unbounded" name="Products" nillable="true" type="tns:Products" />
        </s:sequence>
      </s:complexType>
      <s:complexType name="Products">
        <s:sequence>
          <s:element minOccurs="0" maxOccurs="1" name="KOD" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ACIKLAMA" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="OEM" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="MARKA" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="ARAC" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Liste_Fiyati" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Liste_Fiyati_Birimi" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Stok_Durumu" type="s:string" />
          <s:element minOccurs="0" maxOccurs="1" name="Mesaj" type="s:string" />
        </s:sequence>
      </s:complexType>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="GetProductsSoapIn">
    <wsdl:part name="parameters" element="tns:GetProducts" />
  </wsdl:message>
  <wsdl:message name="GetProductsSoapOut">
    <wsdl:part name="parameters" element="tns:GetProductsResponse" />
  </wsdl:message>
  <wsdl:portType name="ItemXmlServiceSoap">
    <wsdl:operation name="GetProducts">
      <wsdl:input message="tns:GetProductsSoapIn" />
      <wsdl:output message="tns:GetProductsSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="ItemXmlServiceSoap" type="tns:ItemXmlServiceSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetProducts">
      <soap:operation soapAction="http://tempuri.org/GetProducts" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="ItemXmlServiceSoap12" type="tns:ItemXmlServiceSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="GetProducts">
      <soap12:operation soapAction="http://tempuri.org/GetProducts" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="ItemXmlService">
    <wsdl:port name="ItemXmlServiceSoap" binding="tns:ItemXmlServiceSoap">
      <soap:address location="http://www.seneroto.com.tr/xml/ItemXmlService.asmx" />
    </wsdl:port>
    <wsdl:port name="ItemXmlServiceSoap12" binding="tns:ItemXmlServiceSoap12">
      <soap12:address location="http://www.seneroto.com.tr/xml/ItemXmlService.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>