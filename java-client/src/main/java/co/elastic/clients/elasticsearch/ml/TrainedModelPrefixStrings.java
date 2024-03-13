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

package co.elastic.clients.elasticsearch.ml;

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

// typedef: ml._types.TrainedModelPrefixStrings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.TrainedModelPrefixStrings">API
 *      specification</a>
 */
@JsonpDeserializable
public class TrainedModelPrefixStrings implements JsonpSerializable {
	@Nullable
	private final String ingest;

	@Nullable
	private final String search;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelPrefixStrings(Builder builder) {

		this.ingest = builder.ingest;
		this.search = builder.search;

	}

	public static TrainedModelPrefixStrings of(Function<Builder, ObjectBuilder<TrainedModelPrefixStrings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * String prepended to input at ingest
	 * <p>
	 * API name: {@code ingest}
	 */
	@Nullable
	public final String ingest() {
		return this.ingest;
	}

	/**
	 * String prepended to input at search
	 * <p>
	 * API name: {@code search}
	 */
	@Nullable
	public final String search() {
		return this.search;
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

		if (this.ingest != null) {
			generator.writeKey("ingest");
			generator.write(this.ingest);

		}
		if (this.search != null) {
			generator.writeKey("search");
			generator.write(this.search);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelPrefixStrings}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TrainedModelPrefixStrings> {
		@Nullable
		private String ingest;

		@Nullable
		private String search;

		/**
		 * String prepended to input at ingest
		 * <p>
		 * API name: {@code ingest}
		 */
		public final Builder ingest(@Nullable String value) {
			this.ingest = value;
			return this;
		}

		/**
		 * String prepended to input at search
		 * <p>
		 * API name: {@code search}
		 */
		public final Builder search(@Nullable String value) {
			this.search = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TrainedModelPrefixStrings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelPrefixStrings build() {
			_checkSingleUse();

			return new TrainedModelPrefixStrings(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelPrefixStrings}
	 */
	public static final JsonpDeserializer<TrainedModelPrefixStrings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelPrefixStrings::setupTrainedModelPrefixStringsDeserializer);

	protected static void setupTrainedModelPrefixStringsDeserializer(
			ObjectDeserializer<TrainedModelPrefixStrings.Builder> op) {

		op.add(Builder::ingest, JsonpDeserializer.stringDeserializer(), "ingest");
		op.add(Builder::search, JsonpDeserializer.stringDeserializer(), "search");

	}

}
