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

// typedef: watcher._types.LoggingAction

/**
 *
 * @see <a href="../doc-files/api-spec.html#watcher._types.LoggingAction">API
 *      specification</a>
 */
@JsonpDeserializable
public class LoggingAction implements JsonpSerializable {
	@Nullable
	private final String level;

	private final String text;

	@Nullable
	private final String category;

	// ---------------------------------------------------------------------------------------------

	private LoggingAction(Builder builder) {

		this.level = builder.level;
		this.text = ApiTypeHelper.requireNonNull(builder.text, this, "text");
		this.category = builder.category;

	}

	public static LoggingAction of(Function<Builder, ObjectBuilder<LoggingAction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code level}
	 */
	@Nullable
	public final String level() {
		return this.level;
	}

	/**
	 * Required - API name: {@code text}
	 */
	public final String text() {
		return this.text;
	}

	/**
	 * API name: {@code category}
	 */
	@Nullable
	public final String category() {
		return this.category;
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

		if (this.level != null) {
			generator.writeKey("level");
			generator.write(this.level);

		}
		generator.writeKey("text");
		generator.write(this.text);

		if (this.category != null) {
			generator.writeKey("category");
			generator.write(this.category);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LoggingAction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<LoggingAction> {
		@Nullable
		private String level;

		private String text;

		@Nullable
		private String category;

		/**
		 * API name: {@code level}
		 */
		public final Builder level(@Nullable String value) {
			this.level = value;
			return this;
		}

		/**
		 * Required - API name: {@code text}
		 */
		public final Builder text(String value) {
			this.text = value;
			return this;
		}

		/**
		 * API name: {@code category}
		 */
		public final Builder category(@Nullable String value) {
			this.category = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LoggingAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LoggingAction build() {
			_checkSingleUse();

			return new LoggingAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LoggingAction}
	 */
	public static final JsonpDeserializer<LoggingAction> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			LoggingAction::setupLoggingActionDeserializer);

	protected static void setupLoggingActionDeserializer(ObjectDeserializer<LoggingAction.Builder> op) {

		op.add(Builder::level, JsonpDeserializer.stringDeserializer(), "level");
		op.add(Builder::text, JsonpDeserializer.stringDeserializer(), "text");
		op.add(Builder::category, JsonpDeserializer.stringDeserializer(), "category");

	}

}
