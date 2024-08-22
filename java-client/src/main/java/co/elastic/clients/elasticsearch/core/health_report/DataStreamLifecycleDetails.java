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

package co.elastic.clients.elasticsearch.core.health_report;

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

// typedef: _global.health_report.DataStreamLifecycleDetails

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.DataStreamLifecycleDetails">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamLifecycleDetails implements JsonpSerializable {
	private final int stagnatingBackingIndicesCount;

	private final int totalBackingIndicesInError;

	private final List<StagnatingBackingIndices> stagnatingBackingIndices;

	// ---------------------------------------------------------------------------------------------

	private DataStreamLifecycleDetails(Builder builder) {

		this.stagnatingBackingIndicesCount = ApiTypeHelper.requireNonNull(builder.stagnatingBackingIndicesCount, this,
				"stagnatingBackingIndicesCount");
		this.totalBackingIndicesInError = ApiTypeHelper.requireNonNull(builder.totalBackingIndicesInError, this,
				"totalBackingIndicesInError");
		this.stagnatingBackingIndices = ApiTypeHelper.unmodifiable(builder.stagnatingBackingIndices);

	}

	public static DataStreamLifecycleDetails of(Function<Builder, ObjectBuilder<DataStreamLifecycleDetails>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code stagnating_backing_indices_count}
	 */
	public final int stagnatingBackingIndicesCount() {
		return this.stagnatingBackingIndicesCount;
	}

	/**
	 * Required - API name: {@code total_backing_indices_in_error}
	 */
	public final int totalBackingIndicesInError() {
		return this.totalBackingIndicesInError;
	}

	/**
	 * API name: {@code stagnating_backing_indices}
	 */
	public final List<StagnatingBackingIndices> stagnatingBackingIndices() {
		return this.stagnatingBackingIndices;
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

		generator.writeKey("stagnating_backing_indices_count");
		generator.write(this.stagnatingBackingIndicesCount);

		generator.writeKey("total_backing_indices_in_error");
		generator.write(this.totalBackingIndicesInError);

		if (ApiTypeHelper.isDefined(this.stagnatingBackingIndices)) {
			generator.writeKey("stagnating_backing_indices");
			generator.writeStartArray();
			for (StagnatingBackingIndices item0 : this.stagnatingBackingIndices) {
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
	 * Builder for {@link DataStreamLifecycleDetails}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataStreamLifecycleDetails> {
		private Integer stagnatingBackingIndicesCount;

		private Integer totalBackingIndicesInError;

		@Nullable
		private List<StagnatingBackingIndices> stagnatingBackingIndices;

		/**
		 * Required - API name: {@code stagnating_backing_indices_count}
		 */
		public final Builder stagnatingBackingIndicesCount(int value) {
			this.stagnatingBackingIndicesCount = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_backing_indices_in_error}
		 */
		public final Builder totalBackingIndicesInError(int value) {
			this.totalBackingIndicesInError = value;
			return this;
		}

		/**
		 * API name: {@code stagnating_backing_indices}
		 * <p>
		 * Adds all elements of <code>list</code> to
		 * <code>stagnatingBackingIndices</code>.
		 */
		public final Builder stagnatingBackingIndices(List<StagnatingBackingIndices> list) {
			this.stagnatingBackingIndices = _listAddAll(this.stagnatingBackingIndices, list);
			return this;
		}

		/**
		 * API name: {@code stagnating_backing_indices}
		 * <p>
		 * Adds one or more values to <code>stagnatingBackingIndices</code>.
		 */
		public final Builder stagnatingBackingIndices(StagnatingBackingIndices value,
				StagnatingBackingIndices... values) {
			this.stagnatingBackingIndices = _listAdd(this.stagnatingBackingIndices, value, values);
			return this;
		}

		/**
		 * API name: {@code stagnating_backing_indices}
		 * <p>
		 * Adds a value to <code>stagnatingBackingIndices</code> using a builder lambda.
		 */
		public final Builder stagnatingBackingIndices(
				Function<StagnatingBackingIndices.Builder, ObjectBuilder<StagnatingBackingIndices>> fn) {
			return stagnatingBackingIndices(fn.apply(new StagnatingBackingIndices.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamLifecycleDetails}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamLifecycleDetails build() {
			_checkSingleUse();

			return new DataStreamLifecycleDetails(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreamLifecycleDetails}
	 */
	public static final JsonpDeserializer<DataStreamLifecycleDetails> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataStreamLifecycleDetails::setupDataStreamLifecycleDetailsDeserializer);

	protected static void setupDataStreamLifecycleDetailsDeserializer(
			ObjectDeserializer<DataStreamLifecycleDetails.Builder> op) {

		op.add(Builder::stagnatingBackingIndicesCount, JsonpDeserializer.integerDeserializer(),
				"stagnating_backing_indices_count");
		op.add(Builder::totalBackingIndicesInError, JsonpDeserializer.integerDeserializer(),
				"total_backing_indices_in_error");
		op.add(Builder::stagnatingBackingIndices,
				JsonpDeserializer.arrayDeserializer(StagnatingBackingIndices._DESERIALIZER),
				"stagnating_backing_indices");

	}

}
