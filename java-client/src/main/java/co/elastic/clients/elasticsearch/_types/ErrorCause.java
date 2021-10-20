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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.ErrorCause
@JsonpDeserializable
public final class ErrorCause implements JsonpSerializable {
	private final Map<String, JsonData> metadata;

	@Nullable
	private final String type;

	private final String reason;

	@Nullable
	private final String stackTrace;

	@Nullable
	private final ErrorCause causedBy;

	@Nullable
	private final List<ErrorCause> rootCause;

	@Nullable
	private final List<ErrorCause> suppressed;

	// ---------------------------------------------------------------------------------------------

	public ErrorCause(Builder builder) {

		this.metadata = ModelTypeHelper.unmodifiableNonNull(builder.metadata, "metadata");

		this.type = builder.type;
		this.reason = Objects.requireNonNull(builder.reason, "reason");
		this.stackTrace = builder.stackTrace;
		this.causedBy = builder.causedBy;
		this.rootCause = ModelTypeHelper.unmodifiable(builder.rootCause);
		this.suppressed = ModelTypeHelper.unmodifiable(builder.suppressed);

	}

	public ErrorCause(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - Additional details about the error
	 */
	public Map<String, JsonData> metadata() {
		return this.metadata;
	}

	/**
	 * The type of error
	 * <p>
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
	}

	/**
	 * Required - A human-readable explanation of the error, in english
	 * <p>
	 * API name: {@code reason}
	 */
	public String reason() {
		return this.reason;
	}

	/**
	 * The server stack trace. Present only if the <code>error_trace=true</code>
	 * parameter was sent with the request.
	 * <p>
	 * API name: {@code stack_trace}
	 */
	@Nullable
	public String stackTrace() {
		return this.stackTrace;
	}

	/**
	 * API name: {@code caused_by}
	 */
	@Nullable
	public ErrorCause causedBy() {
		return this.causedBy;
	}

	/**
	 * API name: {@code root_cause}
	 */
	@Nullable
	public List<ErrorCause> rootCause() {
		return this.rootCause;
	}

	/**
	 * API name: {@code suppressed}
	 */
	@Nullable
	public List<ErrorCause> suppressed() {
		return this.suppressed;
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

		for (Map.Entry<String, JsonData> item0 : this.metadata.entrySet()) {
			generator.writeKey(item0.getKey());
			item0.getValue().serialize(generator, mapper);

		}

		if (this.type != null) {

			generator.writeKey("type");
			generator.write(this.type);

		}

		generator.writeKey("reason");
		generator.write(this.reason);

		if (this.stackTrace != null) {

			generator.writeKey("stack_trace");
			generator.write(this.stackTrace);

		}
		if (this.causedBy != null) {

			generator.writeKey("caused_by");
			this.causedBy.serialize(generator, mapper);

		}
		if (this.rootCause != null) {

			generator.writeKey("root_cause");
			generator.writeStartArray();
			for (ErrorCause item0 : this.rootCause) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.suppressed != null) {

			generator.writeKey("suppressed");
			generator.writeStartArray();
			for (ErrorCause item0 : this.suppressed) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ErrorCause}.
	 */
	public static class Builder implements ObjectBuilder<ErrorCause> {
		private Map<String, JsonData> metadata = new HashMap<>();

		/**
		 * Required - Additional details about the error
		 */
		public Builder metadata(Map<String, JsonData> value) {
			this.metadata = value;
			return this;
		}

		/**
		 * Add a key/value to {@link #metadata(Map)}, creating the map if needed.
		 */
		public Builder putMetadata(String key, JsonData value) {
			if (this.metadata == null) {
				this.metadata = new HashMap<>();
			}
			this.metadata.put(key, value);
			return this;
		}

		@Nullable
		private String type;

		private String reason;

		@Nullable
		private String stackTrace;

		@Nullable
		private ErrorCause causedBy;

		@Nullable
		private List<ErrorCause> rootCause;

		@Nullable
		private List<ErrorCause> suppressed;

		/**
		 * The type of error
		 * <p>
		 * API name: {@code type}
		 */
		public Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * Required - A human-readable explanation of the error, in english
		 * <p>
		 * API name: {@code reason}
		 */
		public Builder reason(String value) {
			this.reason = value;
			return this;
		}

		/**
		 * The server stack trace. Present only if the <code>error_trace=true</code>
		 * parameter was sent with the request.
		 * <p>
		 * API name: {@code stack_trace}
		 */
		public Builder stackTrace(@Nullable String value) {
			this.stackTrace = value;
			return this;
		}

		/**
		 * API name: {@code caused_by}
		 */
		public Builder causedBy(@Nullable ErrorCause value) {
			this.causedBy = value;
			return this;
		}

		/**
		 * API name: {@code caused_by}
		 */
		public Builder causedBy(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.causedBy(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * API name: {@code root_cause}
		 */
		public Builder rootCause(@Nullable List<ErrorCause> value) {
			this.rootCause = value;
			return this;
		}

		/**
		 * API name: {@code root_cause}
		 */
		public Builder rootCause(ErrorCause... value) {
			this.rootCause = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #rootCause(List)}, creating the list if needed.
		 */
		public Builder addRootCause(ErrorCause value) {
			if (this.rootCause == null) {
				this.rootCause = new ArrayList<>();
			}
			this.rootCause.add(value);
			return this;
		}

		/**
		 * Set {@link #rootCause(List)} to a singleton list.
		 */
		public Builder rootCause(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.rootCause(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Add a value to {@link #rootCause(List)}, creating the list if needed.
		 */
		public Builder addRootCause(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.addRootCause(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * API name: {@code suppressed}
		 */
		public Builder suppressed(@Nullable List<ErrorCause> value) {
			this.suppressed = value;
			return this;
		}

		/**
		 * API name: {@code suppressed}
		 */
		public Builder suppressed(ErrorCause... value) {
			this.suppressed = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #suppressed(List)}, creating the list if needed.
		 */
		public Builder addSuppressed(ErrorCause value) {
			if (this.suppressed == null) {
				this.suppressed = new ArrayList<>();
			}
			this.suppressed.add(value);
			return this;
		}

		/**
		 * Set {@link #suppressed(List)} to a singleton list.
		 */
		public Builder suppressed(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.suppressed(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Add a value to {@link #suppressed(List)}, creating the list if needed.
		 */
		public Builder addSuppressed(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.addSuppressed(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Builds a {@link ErrorCause}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ErrorCause build() {

			return new ErrorCause(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ErrorCause}
	 */
	public static final JsonpDeserializer<ErrorCause> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ErrorCause::setupErrorCauseDeserializer, Builder::build);

	protected static void setupErrorCauseDeserializer(DelegatingDeserializer<ErrorCause.Builder> op) {

		op.add(Builder::type, JsonpDeserializer.stringDeserializer(), "type");
		op.add(Builder::reason, JsonpDeserializer.stringDeserializer(), "reason");
		op.add(Builder::stackTrace, JsonpDeserializer.stringDeserializer(), "stack_trace");
		op.add(Builder::causedBy, ErrorCause._DESERIALIZER, "caused_by");
		op.add(Builder::rootCause, JsonpDeserializer.arrayDeserializer(ErrorCause._DESERIALIZER), "root_cause");
		op.add(Builder::suppressed, JsonpDeserializer.arrayDeserializer(ErrorCause._DESERIALIZER), "suppressed");

		op.setUnknownFieldHandler((builder, name, parser, mapper) -> {
			builder.putMetadata(name, JsonData._DESERIALIZER.deserialize(parser, mapper));
		});
		op.shortcutProperty("reason");

	}

}
