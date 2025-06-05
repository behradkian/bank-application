package com.industry.bank.api.dto.general;

import lombok.AllArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;

@AllArgsConstructor
public class BankRequestHeader<K, V> extends HashMap<K, V> implements Serializable {
}