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

package co.elastic.clients.elasticsearch.tasks;

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: tasks.get.Response
@JsonpDeserializable
public final class GetResponse implements JsonpSerializable {
	private final boolean completed;

	private final Info task;

	@Nullable
	private final Status response;

	@Nullable
	private final ErrorCause error;

	// ---------------------------------------------------------------------------------------------

	public GetResponse(Builder builder) {

		this.completed = Objects.requireNonNull(builder.completed, "completed");
		this.task = Objects.requireNonNull(builder.task, "task");
		this.response = builder.response;
		this.error = builder.error;

	}

	public GetResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code completed}
	 */
	public boolean completed() {
		return this.completed;
	}

	/**
	 * API name: {@code task}
	 */
	public Info task() {
		return this.task;
	}

	/**
	 * API name: {@code response}
	 */
	@Nullable
	public Status response() {
		return this.response;
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public ErrorCause error() {
		return this.error;
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

		generator.writeKey("completed");
		generator.write(this.completed);

		generator.writeKey("task");
		this.task.serialize(generator, mapper);

		if (this.response != null) {

			generator.writeKey("response");
			this.response.serialize(generator, mapper);

		}
		if (this.error != null) {

			generator.writeKey("error");
			this.error.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetResponse> {
		private Boolean completed;

		private Info task;

		@Nullable
		private Status response;

		@Nullable
		private ErrorCause error;

		/**
		 * API name: {@code completed}
		 */
		public Builder completed(boolean value) {
			this.completed = value;
			return this;
		}

		/**
		 * API name: {@code task}
		 */
		public Builder task(Info value) {
			this.task = value;
			return this;
		}

		/**
		 * API name: {@code task}
		 */
		public Builder task(Function<Info.Builder, ObjectBuilder<Info>> fn) {
			return this.task(fn.apply(new Info.Builder()).build());
		}

		/**
		 * API name: {@code response}
		 */
		public Builder response(@Nullable Status value) {
			this.response = value;
			return this;
		}

		/**
		 * API name: {@code response}
		 */
		public Builder response(Function<Status.Builder, ObjectBuilder<Status>> fn) {
			return this.response(fn.apply(new Status.Builder()).build());
		}

		/**
		 * API name: {@code error}
		 */
		public Builder error(@Nullable ErrorCause value) {
			this.error = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public Builder error(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * Builds a {@link GetResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetResponse build() {

			return new GetResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetResponse}
	 */
	public static final JsonpDeserializer<GetResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GetResponse::setupGetResponseDeserializer, Builder::build);

	protected static void setupGetResponseDeserializer(DelegatingDeserializer<GetResponse.Builder> op) {

		op.add(Builder::completed, JsonpDeserializer.booleanDeserializer(), "completed");
		op.add(Builder::task, Info._DESERIALIZER, "task");
		op.add(Builder::response, Status._DESERIALIZER, "response");
		op.add(Builder::error, ErrorCause._DESERIALIZER, "error");

	}

}
