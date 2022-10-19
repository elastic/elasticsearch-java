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

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.GeoIpProcessor

/**
 *
 * @see <a href="../doc-files/api-spec.html#ingest._types.GeoIpProcessor">API
 *      specification</a>
 */
@JsonpDeserializable
public class GeoIpProcessor extends ProcessorBase implements ProcessorVariant {
	@Nullable
	private final String databaseFile;

	private final String field;

	@Nullable
	private final Boolean firstOnly;

	@Nullable
	private final Boolean ignoreMissing;

	private final List<String> properties;

	@Nullable
	private final String targetField;

	// ---------------------------------------------------------------------------------------------

	private GeoIpProcessor(Builder builder) {
		super(builder);

		this.databaseFile = builder.databaseFile;
		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.firstOnly = builder.firstOnly;
		this.ignoreMissing = builder.ignoreMissing;
		this.properties = ApiTypeHelper.unmodifiable(builder.properties);
		this.targetField = builder.targetField;

	}

	public static GeoIpProcessor of(Function<Builder, ObjectBuilder<GeoIpProcessor>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Processor variant kind.
	 */
	@Override
	public Processor.Kind _processorKind() {
		return Processor.Kind.Geoip;
	}

	/**
	 * API name: {@code database_file}
	 */
	@Nullable
	public final String databaseFile() {
		return this.databaseFile;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code first_only}
	 */
	@Nullable
	public final Boolean firstOnly() {
		return this.firstOnly;
	}

	/**
	 * API name: {@code ignore_missing}
	 */
	@Nullable
	public final Boolean ignoreMissing() {
		return this.ignoreMissing;
	}

	/**
	 * API name: {@code properties}
	 */
	public final List<String> properties() {
		return this.properties;
	}

	/**
	 * API name: {@code target_field}
	 */
	@Nullable
	public final String targetField() {
		return this.targetField;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (this.databaseFile != null) {
			generator.writeKey("database_file");
			generator.write(this.databaseFile);

		}
		generator.writeKey("field");
		generator.write(this.field);

		if (this.firstOnly != null) {
			generator.writeKey("first_only");
			generator.write(this.firstOnly);

		}
		if (this.ignoreMissing != null) {
			generator.writeKey("ignore_missing");
			generator.write(this.ignoreMissing);

		}
		if (ApiTypeHelper.isDefined(this.properties)) {
			generator.writeKey("properties");
			generator.writeStartArray();
			for (String item0 : this.properties) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.targetField != null) {
			generator.writeKey("target_field");
			generator.write(this.targetField);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GeoIpProcessor}.
	 */

	public static class Builder extends ProcessorBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<GeoIpProcessor> {
		@Nullable
		private String databaseFile;

		private String field;

		@Nullable
		private Boolean firstOnly;

		@Nullable
		private Boolean ignoreMissing;

		@Nullable
		private List<String> properties;

		@Nullable
		private String targetField;

		/**
		 * API name: {@code database_file}
		 */
		public final Builder databaseFile(@Nullable String value) {
			this.databaseFile = value;
			return this;
		}

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code first_only}
		 */
		public final Builder firstOnly(@Nullable Boolean value) {
			this.firstOnly = value;
			return this;
		}

		/**
		 * API name: {@code ignore_missing}
		 */
		public final Builder ignoreMissing(@Nullable Boolean value) {
			this.ignoreMissing = value;
			return this;
		}

		/**
		 * API name: {@code properties}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>properties</code>.
		 */
		public final Builder properties(List<String> list) {
			this.properties = _listAddAll(this.properties, list);
			return this;
		}

		/**
		 * API name: {@code properties}
		 * <p>
		 * Adds one or more values to <code>properties</code>.
		 */
		public final Builder properties(String value, String... values) {
			this.properties = _listAdd(this.properties, value, values);
			return this;
		}

		/**
		 * API name: {@code target_field}
		 */
		public final Builder targetField(@Nullable String value) {
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
			_checkSingleUse();

			return new GeoIpProcessor(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GeoIpProcessor}
	 */
	public static final JsonpDeserializer<GeoIpProcessor> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GeoIpProcessor::setupGeoIpProcessorDeserializer);

	protected static void setupGeoIpProcessorDeserializer(ObjectDeserializer<GeoIpProcessor.Builder> op) {
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
