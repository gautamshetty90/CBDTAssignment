package com.lnt.controller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lnt.model.PayerDetails;
@Controller
public class PersonalDetailsController {
	private static final String FILE_NAME = "D:/Study/PersonalDetails.xml";

	@RequestMapping("/result")
	public String printToXML(@RequestBody PayerDetails payerDetails) {
		jaxbObjectToXML(payerDetails);
		return "success";
	}

		private static void jaxbObjectToXML(PayerDetails payerDetails) {

			try {
				JAXBContext context = JAXBContext.newInstance(PayerDetails.class);
				Marshaller m = context.createMarshaller();
				// for pretty-print XML in JAXB
				m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

				// Write to File
				m.marshal(payerDetails, new File(FILE_NAME));
			} catch (JAXBException e) {
				e.printStackTrace();
			}
		}
}
