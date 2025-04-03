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

// typedef: watcher._types.SlackResult

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.SlackResult">API
 *      specification</a>
 */
@JsonpDeserializable
public class SlackResult implements JsonpSerializable {
	@Nullable
	private final String account;

	private final SlackMessage message;

	// ---------------------------------------------------------------------------------------------

	private SlackResult(Builder builder) {

		this.account = builder.account;
		this.message = ApiTypeHelper.requireNonNull(builder.message, this, "message");

	}

	public static SlackResult of(Function<Builder, ObjectBuilder<SlackResult>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code account}
	 */
	@Nullable
	public final String account() {
		return this.account;
	}

	/**
	 * Required - API name: {@code message}
	 */
	public final SlackMessage message() {
		return this.message;
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

		if (this.account != null) {
			generator.writeKey("account");
			generator.write(this.account);

		}
		generator.writeKey("message");
		this.message.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link SlackResult}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<SlackResult> {
		@Nullable
		private String account;

		private SlackMessage message;

		/**
		 * API name: {@code account}
		 */
		public final Builder account(@Nullable String value) {
			this.account = value;
			return this;
		}

		/**
		 * Required - API name: {@code message}
		 */
		public final Builder message(SlackMessage value) {
			this.message = value;
			return this;
		}

		/**
		 * Required - API name: {@code message}
		 */
		public final Builder message(Function<SlackMessage.Builder, ObjectBuilder<SlackMessage>> fn) {
			return this.message(fn.apply(new SlackMessage.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SlackResult}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SlackResult build() {
			_checkSingleUse();

			return new SlackResult(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SlackResult}
	 */
	public static final JsonpDeserializer<SlackResult> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			SlackResult::setupSlackResultDeserializer);

	protected static void setupSlackResultDeserializer(ObjectDeserializer<SlackResult.Builder> op) {

		op.add(Builder::account, JsonpDeserializer.stringDeserializer(), "account");
		op.add(Builder::message, SlackMessage._DESERIALIZER, "message");

	}

}
