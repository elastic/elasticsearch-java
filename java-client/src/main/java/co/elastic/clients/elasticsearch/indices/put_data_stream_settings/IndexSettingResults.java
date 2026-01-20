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

package co.elastic.clients.elasticsearch.indices.put_data_stream_settings;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.List;
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

// typedef: indices.put_data_stream_settings.IndexSettingResults

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.put_data_stream_settings.IndexSettingResults">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexSettingResults implements JsonpSerializable {
	private final List<String> appliedToDataStreamOnly;

	private final List<String> appliedToDataStreamAndBackingIndices;

	private final List<DataStreamSettingsError> errors;

	// ---------------------------------------------------------------------------------------------

	private IndexSettingResults(Builder builder) {

		this.appliedToDataStreamOnly = ApiTypeHelper.unmodifiableRequired(builder.appliedToDataStreamOnly, this,
				"appliedToDataStreamOnly");
		this.appliedToDataStreamAndBackingIndices = ApiTypeHelper.unmodifiableRequired(
				builder.appliedToDataStreamAndBackingIndices, this, "appliedToDataStreamAndBackingIndices");
		this.errors = ApiTypeHelper.unmodifiable(builder.errors);

	}

	public static IndexSettingResults of(Function<Builder, ObjectBuilder<IndexSettingResults>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The list of settings that were applied to the data stream but not
	 * to backing indices. These will be applied to the write index the next time
	 * the data stream is rolled over.
	 * <p>
	 * API name: {@code applied_to_data_stream_only}
	 */
	public final List<String> appliedToDataStreamOnly() {
		return this.appliedToDataStreamOnly;
	}

	/**
	 * Required - The list of settings that were applied to the data stream and to
	 * all of its backing indices. These settings will also be applied to the write
	 * index the next time the data stream is rolled over.
	 * <p>
	 * API name: {@code applied_to_data_stream_and_backing_indices}
	 */
	public final List<String> appliedToDataStreamAndBackingIndices() {
		return this.appliedToDataStreamAndBackingIndices;
	}

	/**
	 * API name: {@code errors}
	 */
	public final List<DataStreamSettingsError> errors() {
		return this.errors;
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

		if (ApiTypeHelper.isDefined(this.appliedToDataStreamOnly)) {
			generator.writeKey("applied_to_data_stream_only");
			generator.writeStartArray();
			for (String item0 : this.appliedToDataStreamOnly) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.appliedToDataStreamAndBackingIndices)) {
			generator.writeKey("applied_to_data_stream_and_backing_indices");
			generator.writeStartArray();
			for (String item0 : this.appliedToDataStreamAndBackingIndices) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.errors)) {
			generator.writeKey("errors");
			generator.writeStartArray();
			for (DataStreamSettingsError item0 : this.errors) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexSettingResults}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndexSettingResults> {
		private List<String> appliedToDataStreamOnly;

		private List<String> appliedToDataStreamAndBackingIndices;

		@Nullable
		private List<DataStreamSettingsError> errors;

		public Builder() {
		}
		private Builder(IndexSettingResults instance) {
			this.appliedToDataStreamOnly = instance.appliedToDataStreamOnly;
			this.appliedToDataStreamAndBackingIndices = instance.appliedToDataStreamAndBackingIndices;
			this.errors = instance.errors;

		}
		/**
		 * Required - The list of settings that were applied to the data stream but not
		 * to backing indices. These will be applied to the write index the next time
		 * the data stream is rolled over.
		 * <p>
		 * API name: {@code applied_to_data_stream_only}
		 * <p>
		 * Adds all elements of <code>list</code> to
		 * <code>appliedToDataStreamOnly</code>.
		 */
		public final Builder appliedToDataStreamOnly(List<String> list) {
			this.appliedToDataStreamOnly = _listAddAll(this.appliedToDataStreamOnly, list);
			return this;
		}

		/**
		 * Required - The list of settings that were applied to the data stream but not
		 * to backing indices. These will be applied to the write index the next time
		 * the data stream is rolled over.
		 * <p>
		 * API name: {@code applied_to_data_stream_only}
		 * <p>
		 * Adds one or more values to <code>appliedToDataStreamOnly</code>.
		 */
		public final Builder appliedToDataStreamOnly(String value, String... values) {
			this.appliedToDataStreamOnly = _listAdd(this.appliedToDataStreamOnly, value, values);
			return this;
		}

		/**
		 * Required - The list of settings that were applied to the data stream and to
		 * all of its backing indices. These settings will also be applied to the write
		 * index the next time the data stream is rolled over.
		 * <p>
		 * API name: {@code applied_to_data_stream_and_backing_indices}
		 * <p>
		 * Adds all elements of <code>list</code> to
		 * <code>appliedToDataStreamAndBackingIndices</code>.
		 */
		public final Builder appliedToDataStreamAndBackingIndices(List<String> list) {
			this.appliedToDataStreamAndBackingIndices = _listAddAll(this.appliedToDataStreamAndBackingIndices, list);
			return this;
		}

		/**
		 * Required - The list of settings that were applied to the data stream and to
		 * all of its backing indices. These settings will also be applied to the write
		 * index the next time the data stream is rolled over.
		 * <p>
		 * API name: {@code applied_to_data_stream_and_backing_indices}
		 * <p>
		 * Adds one or more values to <code>appliedToDataStreamAndBackingIndices</code>.
		 */
		public final Builder appliedToDataStreamAndBackingIndices(String value, String... values) {
			this.appliedToDataStreamAndBackingIndices = _listAdd(this.appliedToDataStreamAndBackingIndices, value,
					values);
			return this;
		}

		/**
		 * API name: {@code errors}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>errors</code>.
		 */
		public final Builder errors(List<DataStreamSettingsError> list) {
			this.errors = _listAddAll(this.errors, list);
			return this;
		}

		/**
		 * API name: {@code errors}
		 * <p>
		 * Adds one or more values to <code>errors</code>.
		 */
		public final Builder errors(DataStreamSettingsError value, DataStreamSettingsError... values) {
			this.errors = _listAdd(this.errors, value, values);
			return this;
		}

		/**
		 * API name: {@code errors}
		 * <p>
		 * Adds a value to <code>errors</code> using a builder lambda.
		 */
		public final Builder errors(
				Function<DataStreamSettingsError.Builder, ObjectBuilder<DataStreamSettingsError>> fn) {
			return errors(fn.apply(new DataStreamSettingsError.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexSettingResults}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexSettingResults build() {
			_checkSingleUse();

			return new IndexSettingResults(this);
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
	 * Json deserializer for {@link IndexSettingResults}
	 */
	public static final JsonpDeserializer<IndexSettingResults> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexSettingResults::setupIndexSettingResultsDeserializer);

	protected static void setupIndexSettingResultsDeserializer(ObjectDeserializer<IndexSettingResults.Builder> op) {

		op.add(Builder::appliedToDataStreamOnly,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"applied_to_data_stream_only");
		op.add(Builder::appliedToDataStreamAndBackingIndices,
				JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"applied_to_data_stream_and_backing_indices");
		op.add(Builder::errors, JsonpDeserializer.arrayDeserializer(DataStreamSettingsError._DESERIALIZER), "errors");

	}

}
