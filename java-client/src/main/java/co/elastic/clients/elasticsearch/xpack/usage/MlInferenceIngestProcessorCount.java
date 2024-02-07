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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

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

// typedef: xpack.usage.MlInferenceIngestProcessorCount

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.MlInferenceIngestProcessorCount">API
 *      specification</a>
 */
@JsonpDeserializable
public class MlInferenceIngestProcessorCount implements JsonpSerializable {
	private final long max;

	private final long sum;

	private final long min;

	// ---------------------------------------------------------------------------------------------

	private MlInferenceIngestProcessorCount(Builder builder) {

		this.max = ApiTypeHelper.requireNonNull(builder.max, this, "max");
		this.sum = ApiTypeHelper.requireNonNull(builder.sum, this, "sum");
		this.min = ApiTypeHelper.requireNonNull(builder.min, this, "min");

	}

	public static MlInferenceIngestProcessorCount of(
			Function<Builder, ObjectBuilder<MlInferenceIngestProcessorCount>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code max}
	 */
	public final long max() {
		return this.max;
	}

	/**
	 * Required - API name: {@code sum}
	 */
	public final long sum() {
		return this.sum;
	}

	/**
	 * Required - API name: {@code min}
	 */
	public final long min() {
		return this.min;
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

		generator.writeKey("max");
		generator.write(this.max);

		generator.writeKey("sum");
		generator.write(this.sum);

		generator.writeKey("min");
		generator.write(this.min);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlInferenceIngestProcessorCount}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MlInferenceIngestProcessorCount> {
		private Long max;

		private Long sum;

		private Long min;

		/**
		 * Required - API name: {@code max}
		 */
		public final Builder max(long value) {
			this.max = value;
			return this;
		}

		/**
		 * Required - API name: {@code sum}
		 */
		public final Builder sum(long value) {
			this.sum = value;
			return this;
		}

		/**
		 * Required - API name: {@code min}
		 */
		public final Builder min(long value) {
			this.min = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MlInferenceIngestProcessorCount}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlInferenceIngestProcessorCount build() {
			_checkSingleUse();

			return new MlInferenceIngestProcessorCount(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlInferenceIngestProcessorCount}
	 */
	public static final JsonpDeserializer<MlInferenceIngestProcessorCount> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MlInferenceIngestProcessorCount::setupMlInferenceIngestProcessorCountDeserializer);

	protected static void setupMlInferenceIngestProcessorCountDeserializer(
			ObjectDeserializer<MlInferenceIngestProcessorCount.Builder> op) {

		op.add(Builder::max, JsonpDeserializer.longDeserializer(), "max");
		op.add(Builder::sum, JsonpDeserializer.longDeserializer(), "sum");
		op.add(Builder::min, JsonpDeserializer.longDeserializer(), "min");

	}

}
