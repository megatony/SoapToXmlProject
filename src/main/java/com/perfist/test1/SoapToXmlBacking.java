/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.perfist.test1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import ws.ArrayOfProducts;
import ws.ItemXmlService;
import ws.Products;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.util.List;

public class SoapToXmlBacking
{
    public SoapToXmlBacking() {
    }

    public String getResult() {
    try {
        DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

        Document document = documentBuilder.newDocument();

        Element root = document.createElement("products");
        document.appendChild(root);


        ItemXmlService itemXmlService = new ItemXmlService();

        ArrayOfProducts arrayOfProducts = itemXmlService.getItemXmlServiceSoap12().getProducts("USER_NAME_MASKED","PASSWORD_MASKED");
        List<Products> productsList = arrayOfProducts.getProducts();

        for(Products products : productsList) {
            Element productElement = document.createElement("product");
            root.appendChild(productElement);

            Element kod = document.createElement("KOD");
            kod.appendChild(document.createTextNode(String.valueOf(products.getKOD())));
            productElement.appendChild(kod);

            Element aciklama = document.createElement("ACIKLAMA");
            aciklama.appendChild(document.createTextNode("<![CDATA[" + String.valueOf(products.getACIKLAMA()) + "]]>"));
            productElement.appendChild(aciklama);

            Element arac = document.createElement("ARAC");
            arac.appendChild(document.createTextNode(String.valueOf(products.getARAC())));
            productElement.appendChild(arac);

            Element listeFiyati = document.createElement("LISTEFIYATI");
            listeFiyati.appendChild(document.createTextNode(String.valueOf(products.getListeFiyati())));
            productElement.appendChild(listeFiyati);

            Element listefiyatibirimi = document.createElement("LISTEFIYATIBIRIMI");
            listefiyatibirimi.appendChild(document.createTextNode(String.valueOf(products.getListeFiyatiBirimi())));
            productElement.appendChild(listefiyatibirimi);

            Element marka = document.createElement("MARKA");
            marka.appendChild(document.createTextNode(String.valueOf(products.getMARKA())));
            productElement.appendChild(marka);

            Element oem = document.createElement("OEM");
            oem.appendChild(document.createTextNode(String.valueOf(products.getOEM())));
            productElement.appendChild(oem);

            Element stokdurumu = document.createElement("STOKDURUMU");
            stokdurumu.appendChild(document.createTextNode(String.valueOf(products.getStokDurumu())));
            productElement.appendChild(stokdurumu);
        }

        StringWriter sw = new StringWriter();

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(document);

        transformer.transform(domSource, new StreamResult(sw));
        String result = sw.toString().split("<products>")[1];

        return "<products>" + result;
    } catch (Exception e) {
        return "<products></products>";
    }
    }
}