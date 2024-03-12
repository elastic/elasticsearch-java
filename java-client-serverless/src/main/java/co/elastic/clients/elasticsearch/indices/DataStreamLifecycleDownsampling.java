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

package co.elastic.clients.elasticsearch.indices;

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

// typedef: indices._types.DataStreamLifecycleDownsampling

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.DataStreamLifecycleDownsampling">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataStreamLifecycleDownsampling implements JsonpSerializable {
	private final List<DownsamplingRound> rounds;

	// ---------------------------------------------------------------------------------------------

	private DataStreamLifecycleDownsampling(Builder builder) {

		this.rounds = ApiTypeHelper.unmodifiableRequired(builder.rounds, this, "rounds");

	}

	public static DataStreamLifecycleDownsampling of(
			Function<Builder, ObjectBuilder<DataStreamLifecycleDownsampling>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The list of downsampling rounds to execute as part of this
	 * downsampling configuration
	 * <p>
	 * API name: {@code rounds}
	 */
	public final List<DownsamplingRound> rounds() {
		return this.rounds;
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

		if (ApiTypeHelper.isDefined(this.rounds)) {
			generator.writeKey("rounds");
			generator.writeStartArray();
			for (DownsamplingRound item0 : this.rounds) {
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
	 * Builder for {@link DataStreamLifecycleDownsampling}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataStreamLifecycleDownsampling> {
		private List<DownsamplingRound> rounds;

		/**
		 * Required - The list of downsampling rounds to execute as part of this
		 * downsampling configuration
		 * <p>
		 * API name: {@code rounds}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>rounds</code>.
		 */
		public final Builder rounds(List<DownsamplingRound> list) {
			this.rounds = _listAddAll(this.rounds, list);
			return this;
		}

		/**
		 * Required - The list of downsampling rounds to execute as part of this
		 * downsampling configuration
		 * <p>
		 * API name: {@code rounds}
		 * <p>
		 * Adds one or more values to <code>rounds</code>.
		 */
		public final Builder rounds(DownsamplingRound value, DownsamplingRound... values) {
			this.rounds = _listAdd(this.rounds, value, values);
			return this;
		}

		/**
		 * Required - The list of downsampling rounds to execute as part of this
		 * downsampling configuration
		 * <p>
		 * API name: {@code rounds}
		 * <p>
		 * Adds a value to <code>rounds</code> using a builder lambda.
		 */
		public final Builder rounds(Function<DownsamplingRound.Builder, ObjectBuilder<DownsamplingRound>> fn) {
			return rounds(fn.apply(new DownsamplingRound.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataStreamLifecycleDownsampling}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataStreamLifecycleDownsampling build() {
			_checkSingleUse();

			return new DataStreamLifecycleDownsampling(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataStreamLifecycleDownsampling}
	 */
	public static final JsonpDeserializer<DataStreamLifecycleDownsampling> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataStreamLifecycleDownsampling::setupDataStreamLifecycleDownsamplingDeserializer);

	protected static void setupDataStreamLifecycleDownsamplingDeserializer(
			ObjectDeserializer<DataStreamLifecycleDownsampling.Builder> op) {

		op.add(Builder::rounds, JsonpDeserializer.arrayDeserializer(DownsamplingRound._DESERIALIZER), "rounds");

	}

}
