package com.hamit.creation.builder;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@NonNull
public class BuilderClassLombok implements Serializable {
	private static final long serialVersionUID = 2455573983298197817L;

	private String adi = "";
	private String soyadi;

}
