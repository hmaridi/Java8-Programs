package com.java8.demo.programmer.guide;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.java8.demo.programmer.guide.Transaction;

public class ReadCSVUsingJava8 {

	public static void main(String[] args) throws IOException {
		Path path = Path.of("C:\\Users\\HARI KISHORE\\Downloads\\tranx.csv");

		if (Files.exists(path)) {
			List<Transaction> tranxList = Files.lines(path).skip(1).map(line -> {
				String[] csvData = line.split(",");
				return new Transaction(csvData[0], csvData[1], csvData[2], csvData[3], csvData[4]);
			}).collect(Collectors.toList());

			// Group the transaction data by tranaction id
			Map<String, List<Transaction>> traxMap = tranxList.stream()
					.collect(Collectors.groupingBy(Transaction::getTraxId, Collectors.toList()));
			//System.out.println(traxMap);

			// Convert transaction data as a JSON
			for (Map.Entry<String, List<Transaction>> tranxEntry : traxMap.entrySet()) {
				List<Transaction> trxList = tranxEntry.getValue();
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				String jsonTranxList = gson.toJson(trxList);
				System.out.println(tranxEntry.getKey() + jsonTranxList);
			}

		} else {
			System.out.println("File not found");
		}
	}

}
