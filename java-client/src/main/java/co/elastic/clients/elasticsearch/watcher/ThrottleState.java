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

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
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

// typedef: watcher._types.ThrottleState

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.ThrottleState">API
 *      specification</a>
 */
@JsonpDeserializable
public class ThrottleState implements JsonpSerializable {
	private final String reason;

	private final DateTime timestamp;

	// ---------------------------------------------------------------------------------------------

	private ThrottleState(Builder builder) {

		this.reason = ApiTypeHelper.requireNonNull(builder.reason, this, "reason");
		this.timestamp = ApiTypeHelper.requireNonNull(builder.timestamp, this, "timestamp");

	}

	public static ThrottleState of(Function<Builder, ObjectBuilder<ThrottleState>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code reason}
	 */
	public final String reason() {
		return this.reason;
	}

	/**
	 * Required - API name: {@code timestamp}
	 */
	public final DateTime timestamp() {
		return this.timestamp;
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

		generator.writeKey("reason");
		generator.write(this.reason);

		generator.writeKey("timestamp");
		this.timestamp.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ThrottleState}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ThrottleState> {
		private String reason;

		private DateTime timestamp;

		/**
		 * Required - API name: {@code reason}
		 */
		public final Builder reason(String value) {
			this.reason = value;
			return this;
		}

		/**
		 * Required - API name: {@code timestamp}
		 */
		public final Builder timestamp(DateTime value) {
			this.timestamp = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ThrottleState}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ThrottleState build() {
			_checkSingleUse();

			return new ThrottleState(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ThrottleState}
	 */
	public static final JsonpDeserializer<ThrottleState> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ThrottleState::setupThrottleStateDeserializer);

	protected static void setupThrottleStateDeserializer(ObjectDeserializer<ThrottleState.Builder> op) {

		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::timestamp, DateTime._DESERIALIZER, "timestamp");

	}

}
