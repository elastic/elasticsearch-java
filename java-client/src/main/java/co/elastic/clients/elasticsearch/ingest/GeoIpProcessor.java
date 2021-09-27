/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ingest._types.GeoIpProcessor
@JsonpDeserializable
public final class GeoIpProcessor extends ProcessorBase implements ProcessorVariant {
	private final String databaseFile;

	private final String field;

	private final Boolean firstOnly;

	private final Boolean ignoreMissing;

	private final List<String> properties;

	private final String targetField;

	// ---------------------------------------------------------------------------------------------

	public GeoIpProcessor(Builder builder) {
		super(builder);

		this.databaseFile = Objects.requireNonNull(builder.databaseFile, "database_file");
		this.field = Objects.requireNonNull(builder.field, "field");
		this.firstOnly = Objects.requireNonNull(builder.firstOnly, "first_only");
		this.ignoreMissing = Objects.requireNonNull(builder.ignoreMissing, "ignore_missing");
		this.properties = Objects.requireNonNull(builder.properties, "properties");
		this.targetField = Objects.requireNonNull(builder.targetField, "target_field");

	}

	/**
	 * {@link Processor} variant type
	 */
	@Override
	public String _variantType() {
		return "geoip";
	}

	/**
	 * API name: {@code database_file}
	 */
	public String databaseFile() {
		return this.databaseFile;
	}

	/**
	 * API name: {@code field}
	 */
	public String field() {
		return this.field;
	}

	/**
	 * API name: {@code first_only}
	 */
	public Boolean firstOnly() {
		return this.firstOnly;
	}

	/**
	 * API name: {@code ignore_missing}
	 */
	public Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * API name: {@code properties}
	 */
	public List<String> properties() {
		return this.properties;
	}

	/**
	 * API name: {@code target_field}
	 */
	public String targetField() {
		return this.targetField;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);

		generator.writeKey("database_file");
		generator.write(this.databaseFile);

		generator.writeKey("field");
		generator.write(this.field);

		generator.writeKey("first_only");
		generator.write(this.firstOnly);

		generator.writeKey("ignore_missing");
		generator.write(this.ignoreMissing);

		generator.writeKey("properties");
		generator.writeStartArray();
		for (String item0 : this.properties) {
			generator.write(item0);

		}
		generator.writeEnd();

		generator.writeKey("target_field");
		generator.write(this.targetField);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoIpProcessor}.
	 */
	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoIpProcessor> {
		private String databaseFile;

		private String field;

		private Boolean firstOnly;

		private Boolean ignoreMissing;

		private List<String> properties;

		private String targetField;

		/**
		 * API name: {@code database_file}
		 */
		public Builder databaseFile(String value) {
			this.databaseFile = value;
			return this;
		}

		/**
		 * API name: {@code field}
		 */
		public Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code first_only}
		 */
		public Builder firstOnly(Boolean value) {
			this.firstOnly = value;
			return this;
		}

		/**
		 * API name: {@code ignore_missing}
		 */
		public Builder ignoreMissing(Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * API name: {@code properties}
		 */
		public Builder properties(List<String> value) {
			this.properties = value;
			return this;
		}

		/**
		 * API name: {@code properties}
		 */
		public Builder properties(String... value) {
			this.properties = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #properties(List)}, creating the list if needed.
		 */
		public Builder addProperties(String value) {
			if (this.properties == null) {
				this.properties = new ArrayList<>();
			}
			this.properties.add(value);
			return this;
		}

		/**
		 * API name: {@code target_field}
		 */
		public Builder targetField(String value) {
			this.targetField = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GeoIpProcessor}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GeoIpProcessor build() {

			return new GeoIpProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoIpProcessor}
	 */
	public static final JsonpDeserializer<GeoIpProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoIpProcessor::setupGeoIpProcessorDeserializer, Builder::build);

	protected static void setupGeoIpProcessorDeserializer(DelegatingDeserializer<GeoIpProcessor.Builder> op) {
		ProcessorBase.setupProcessorBaseDeserializer(op);
		op.add(Builder::databaseFile, JsonpDeserializer.stringDeserializer(), "database_file");
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::firstOnly, JsonpDeserializer.booleanDeserializer(), "first_only");
		op.add(Builder::ignoreMissing, JsonpDeserializer.booleanDeserializer(), "ignore_missing");
		op.add(Builder::properties, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"properties");
		op.add(Builder::targetField, JsonpDeserializer.stringDeserializer(), "target_field");

	}

}
