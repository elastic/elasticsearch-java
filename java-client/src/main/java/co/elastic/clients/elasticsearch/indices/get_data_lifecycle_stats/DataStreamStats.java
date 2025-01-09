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

package co.elastic.clients.elasticsearch.indices.get_data_lifecycle_stats;

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
import java.lang.Integer;
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

// typedef: indices.get_data_lifecycle_stats.DataStreamStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.get_data_lifecycle_stats.DataStreamStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamStats implements JsonpSerializable {
	private final int backingIndicesInError;

	private final int backingIndicesInTotal;

	private final String name;

	// ---------------------------------------------------------------------------------------------

	private DataStreamStats(Builder builder) {

		this.backingIndicesInError = ApiTypeHelper.requireNonNull(builder.backingIndicesInError, this,
				"backingIndicesInError");
		this.backingIndicesInTotal = ApiTypeHelper.requireNonNull(builder.backingIndicesInTotal, this,
				"backingIndicesInTotal");
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");

	}

	public static DataStreamStats of(Function<Builder, ObjectBuilder<DataStreamStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The count of the backing indices for the data stream.
	 * <p>
	 * API name: {@code backing_indices_in_error}
	 */
	public final int backingIndicesInError() {
		return this.backingIndicesInError;
	}

	/**
	 * Required - The count of the backing indices for the data stream that have
	 * encountered an error.
	 * <p>
	 * API name: {@code backing_indices_in_total}
	 */
	public final int backingIndicesInTotal() {
		return this.backingIndicesInTotal;
	}

	/**
	 * Required - The name of the data stream.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
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

		generator.writeKey("backing_indices_in_error");
		generator.write(this.backingIndicesInError);

		generator.writeKey("backing_indices_in_total");
		generator.write(this.backingIndicesInTotal);

		generator.writeKey("name");
		generator.write(this.name);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataStreamStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DataStreamStats> {
		private Integer backingIndicesInError;

		private Integer backingIndicesInTotal;

		private String name;

		/**
		 * Required - The count of the backing indices for the data stream.
		 * <p>
		 * API name: {@code backing_indices_in_error}
		 */
		public final Builder backingIndicesInError(int value) {
			this.backingIndicesInError = value;
			return this;
		}

		/**
		 * Required - The count of the backing indices for the data stream that have
		 * encountered an error.
		 * <p>
		 * API name: {@code backing_indices_in_total}
		 */
		public final Builder backingIndicesInTotal(int value) {
			this.backingIndicesInTotal = value;
			return this;
		}

		/**
		 * Required - The name of the data stream.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamStats build() {
			_checkSingleUse();

			return new DataStreamStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreamStats}
	 */
	public static final JsonpDeserializer<DataStreamStats> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			DataStreamStats::setupDataStreamStatsDeserializer);

	protected static void setupDataStreamStatsDeserializer(ObjectDeserializer<DataStreamStats.Builder> op) {

		op.add(Builder::backingIndicesInError, JsonpDeserializer.integerDeserializer(), "backing_indices_in_error");
		op.add(Builder::backingIndicesInTotal, JsonpDeserializer.integerDeserializer(), "backing_indices_in_total");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");

	}

}
