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

package co.elastic.clients.elasticsearch.esql;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: esql._types.EsqlQuerySettings

/**
 * Per-query settings supplied through the request body. This is the
 * request-body equivalent of the in-query <code>SET</code> command. Only
 * settings that are exposed as request-body parameters can be set here; other
 * <code>SET</code>-only settings (such as <code>unmapped_fields</code>) must be
 * supplied in the query itself.
 * 
 * @see <a href="../doc-files/api-spec.html#esql._types.EsqlQuerySettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class EsqlQuerySettings implements JsonpSerializable {
	@Nullable
	private final String timeZone;

	@Nullable
	private final EsqlApproximation approximation;

	@Nullable
	private final Boolean columnMetadata;

	@Nullable
	private final String projectRouting;

	// ---------------------------------------------------------------------------------------------

	private EsqlQuerySettings(Builder builder) {

		this.timeZone = builder.timeZone;
		this.approximation = builder.approximation;
		this.columnMetadata = builder.columnMetadata;
		this.projectRouting = builder.projectRouting;

	}

	public static EsqlQuerySettings of(Function<Builder, ObjectBuilder<EsqlQuerySettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * The default timezone to be used in the query. It defaults to UTC and
	 * overrides the <code>time_zone</code> request parameter.
	 * <p>
	 * API name: {@code time_zone}
	 */
	@Nullable
	public final String timeZone() {
		return this.timeZone;
	}

	/**
	 * Enables query approximation if possible for the query. <code>false</code>
	 * (the default) disables query approximation and <code>true</code> enables it
	 * with default settings. A map value enables query approximation with custom
	 * settings.
	 * <p>
	 * API name: {@code approximation}
	 */
	@Nullable
	public final EsqlApproximation approximation() {
		return this.approximation;
	}

	/**
	 * When enabled, column metadata is added to the query response as additional
	 * <code>_meta</code> properties. Currently, only <code>_meta.bucket</code> is
	 * added for columns corresponding to the <code>BUCKET</code> function,
	 * containing the bucket interval and unit for queries where it can be
	 * determined.
	 * <p>
	 * API name: {@code column_metadata}
	 */
	@Nullable
	public final Boolean columnMetadata() {
		return this.columnMetadata;
	}

	/**
	 * Limits the scope of a cross-project search (CPS) to specific projects before
	 * query execution, based on a Lucene query expression evaluated against project
	 * tags. Excluded projects are not queried, which can reduce cost and latency.
	 * <p>
	 * API name: {@code project_routing}
	 */
	@Nullable
	public final String projectRouting() {
		return this.projectRouting;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.timeZone != null) {
			generator.writeKey("time_zone");
			generator.write(this.timeZone);

		}
		if (this.approximation != null) {
			generator.writeKey("approximation");
			this.approximation.serialize(generator, mapper);

		}
		if (this.columnMetadata != null) {
			generator.writeKey("column_metadata");
			generator.write(this.columnMetadata);

		}
		if (this.projectRouting != null) {
			generator.writeKey("project_routing");
			generator.write(this.projectRouting);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EsqlQuerySettings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<EsqlQuerySettings> {
		@Nullable
		private String timeZone;

		@Nullable
		private EsqlApproximation approximation;

		@Nullable
		private Boolean columnMetadata;

		@Nullable
		private String projectRouting;

		public Builder() {
		}
		private Builder(EsqlQuerySettings instance) {
			this.timeZone = instance.timeZone;
			this.approximation = instance.approximation;
			this.columnMetadata = instance.columnMetadata;
			this.projectRouting = instance.projectRouting;

		}
		/**
		 * The default timezone to be used in the query. It defaults to UTC and
		 * overrides the <code>time_zone</code> request parameter.
		 * <p>
		 * API name: {@code time_zone}
		 */
		public final Builder timeZone(@Nullable String value) {
			this.timeZone = value;
			return this;
		}

		/**
		 * Enables query approximation if possible for the query. <code>false</code>
		 * (the default) disables query approximation and <code>true</code> enables it
		 * with default settings. A map value enables query approximation with custom
		 * settings.
		 * <p>
		 * API name: {@code approximation}
		 */
		public final Builder approximation(@Nullable EsqlApproximation value) {
			this.approximation = value;
			return this;
		}

		/**
		 * Enables query approximation if possible for the query. <code>false</code>
		 * (the default) disables query approximation and <code>true</code> enables it
		 * with default settings. A map value enables query approximation with custom
		 * settings.
		 * <p>
		 * API name: {@code approximation}
		 */
		public final Builder approximation(Function<EsqlApproximation.Builder, ObjectBuilder<EsqlApproximation>> fn) {
			return this.approximation(fn.apply(new EsqlApproximation.Builder()).build());
		}

		/**
		 * When enabled, column metadata is added to the query response as additional
		 * <code>_meta</code> properties. Currently, only <code>_meta.bucket</code> is
		 * added for columns corresponding to the <code>BUCKET</code> function,
		 * containing the bucket interval and unit for queries where it can be
		 * determined.
		 * <p>
		 * API name: {@code column_metadata}
		 */
		public final Builder columnMetadata(@Nullable Boolean value) {
			this.columnMetadata = value;
			return this;
		}

		/**
		 * Limits the scope of a cross-project search (CPS) to specific projects before
		 * query execution, based on a Lucene query expression evaluated against project
		 * tags. Excluded projects are not queried, which can reduce cost and latency.
		 * <p>
		 * API name: {@code project_routing}
		 */
		public final Builder projectRouting(@Nullable String value) {
			this.projectRouting = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EsqlQuerySettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EsqlQuerySettings build() {
			_checkSingleUse();

			return new EsqlQuerySettings(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EsqlQuerySettings}
	 */
	public static final JsonpDeserializer<EsqlQuerySettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EsqlQuerySettings::setupEsqlQuerySettingsDeserializer);

	protected static void setupEsqlQuerySettingsDeserializer(ObjectDeserializer<EsqlQuerySettings.Builder> op) {

		op.add(Builder::timeZone, JsonpDeserializer.stringDeserializer(), "time_zone");
		op.add(Builder::approximation, EsqlApproximation._DESERIALIZER, "approximation");
		op.add(Builder::columnMetadata, JsonpDeserializer.booleanDeserializer(), "column_metadata");
		op.add(Builder::projectRouting, JsonpDeserializer.stringDeserializer(), "project_routing");

	}

}
