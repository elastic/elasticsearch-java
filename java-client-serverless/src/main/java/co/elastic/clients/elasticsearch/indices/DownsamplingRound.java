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

import co.elastic.clients.elasticsearch._types.Time;
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

// typedef: indices._types.DownsamplingRound

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.DownsamplingRound">API
 *      specification</a>
 */
@JsonpDeserializable
public class DownsamplingRound implements JsonpSerializable {
	private final Time after;

	private final DownsampleConfig config;

	// ---------------------------------------------------------------------------------------------

	private DownsamplingRound(Builder builder) {

		this.after = ApiTypeHelper.requireNonNull(builder.after, this, "after");
		this.config = ApiTypeHelper.requireNonNull(builder.config, this, "config");

	}

	public static DownsamplingRound of(Function<Builder, ObjectBuilder<DownsamplingRound>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The duration since rollover when this downsampling round should
	 * execute
	 * <p>
	 * API name: {@code after}
	 */
	public final Time after() {
		return this.after;
	}

	/**
	 * Required - The downsample configuration to execute.
	 * <p>
	 * API name: {@code config}
	 */
	public final DownsampleConfig config() {
		return this.config;
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

		generator.writeKey("after");
		this.after.serialize(generator, mapper);

		generator.writeKey("config");
		this.config.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DownsamplingRound}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<DownsamplingRound> {
		private Time after;

		private DownsampleConfig config;

		/**
		 * Required - The duration since rollover when this downsampling round should
		 * execute
		 * <p>
		 * API name: {@code after}
		 */
		public final Builder after(Time value) {
			this.after = value;
			return this;
		}

		/**
		 * Required - The duration since rollover when this downsampling round should
		 * execute
		 * <p>
		 * API name: {@code after}
		 */
		public final Builder after(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.after(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The downsample configuration to execute.
		 * <p>
		 * API name: {@code config}
		 */
		public final Builder config(DownsampleConfig value) {
			this.config = value;
			return this;
		}

		/**
		 * Required - The downsample configuration to execute.
		 * <p>
		 * API name: {@code config}
		 */
		public final Builder config(Function<DownsampleConfig.Builder, ObjectBuilder<DownsampleConfig>> fn) {
			return this.config(fn.apply(new DownsampleConfig.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DownsamplingRound}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DownsamplingRound build() {
			_checkSingleUse();

			return new DownsamplingRound(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DownsamplingRound}
	 */
	public static final JsonpDeserializer<DownsamplingRound> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DownsamplingRound::setupDownsamplingRoundDeserializer);

	protected static void setupDownsamplingRoundDeserializer(ObjectDeserializer<DownsamplingRound.Builder> op) {

		op.add(Builder::after, Time._DESERIALIZER, "after");
		op.add(Builder::config, DownsampleConfig._DESERIALIZER, "config");

	}

}
