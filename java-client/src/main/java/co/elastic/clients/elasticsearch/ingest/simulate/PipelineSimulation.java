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

package co.elastic.clients.elasticsearch.ingest.simulate;

import co.elastic.clients.elasticsearch._types.ErrorCause;
import co.elastic.clients.elasticsearch.watcher.ActionStatusOptions;
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

// typedef: ingest.simulate.PipelineSimulation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#ingest.simulate.PipelineSimulation">API
 *      specification</a>
 */
@JsonpDeserializable
public class PipelineSimulation implements JsonpSerializable {
	@Nullable
	private final DocumentSimulation doc;

	@Nullable
	private final String tag;

	@Nullable
	private final String processorType;

	@Nullable
	private final ActionStatusOptions status;

	@Nullable
	private final String description;

	@Nullable
	private final ErrorCause ignoredError;

	@Nullable
	private final ErrorCause error;

	// ---------------------------------------------------------------------------------------------

	private PipelineSimulation(Builder builder) {

		this.doc = builder.doc;
		this.tag = builder.tag;
		this.processorType = builder.processorType;
		this.status = builder.status;
		this.description = builder.description;
		this.ignoredError = builder.ignoredError;
		this.error = builder.error;

	}

	public static PipelineSimulation of(Function<Builder, ObjectBuilder<PipelineSimulation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code doc}
	 */
	@Nullable
	public final DocumentSimulation doc() {
		return this.doc;
	}

	/**
	 * API name: {@code tag}
	 */
	@Nullable
	public final String tag() {
		return this.tag;
	}

	/**
	 * API name: {@code processor_type}
	 */
	@Nullable
	public final String processorType() {
		return this.processorType;
	}

	/**
	 * API name: {@code status}
	 */
	@Nullable
	public final ActionStatusOptions status() {
		return this.status;
	}

	/**
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * API name: {@code ignored_error}
	 */
	@Nullable
	public final ErrorCause ignoredError() {
		return this.ignoredError;
	}

	/**
	 * API name: {@code error}
	 */
	@Nullable
	public final ErrorCause error() {
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

		if (this.doc != null) {
			generator.writeKey("doc");
			this.doc.serialize(generator, mapper);

		}
		if (this.tag != null) {
			generator.writeKey("tag");
			generator.write(this.tag);

		}
		if (this.processorType != null) {
			generator.writeKey("processor_type");
			generator.write(this.processorType);

		}
		if (this.status != null) {
			generator.writeKey("status");
			this.status.serialize(generator, mapper);
		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.ignoredError != null) {
			generator.writeKey("ignored_error");
			this.ignoredError.serialize(generator, mapper);

		}
		if (this.error != null) {
			generator.writeKey("error");
			this.error.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PipelineSimulation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<PipelineSimulation> {
		@Nullable
		private DocumentSimulation doc;

		@Nullable
		private String tag;

		@Nullable
		private String processorType;

		@Nullable
		private ActionStatusOptions status;

		@Nullable
		private String description;

		@Nullable
		private ErrorCause ignoredError;

		@Nullable
		private ErrorCause error;

		/**
		 * API name: {@code doc}
		 */
		public final Builder doc(@Nullable DocumentSimulation value) {
			this.doc = value;
			return this;
		}

		/**
		 * API name: {@code doc}
		 */
		public final Builder doc(Function<DocumentSimulation.Builder, ObjectBuilder<DocumentSimulation>> fn) {
			return this.doc(fn.apply(new DocumentSimulation.Builder()).build());
		}

		/**
		 * API name: {@code tag}
		 */
		public final Builder tag(@Nullable String value) {
			this.tag = value;
			return this;
		}

		/**
		 * API name: {@code processor_type}
		 */
		public final Builder processorType(@Nullable String value) {
			this.processorType = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public final Builder status(@Nullable ActionStatusOptions value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * API name: {@code ignored_error}
		 */
		public final Builder ignoredError(@Nullable ErrorCause value) {
			this.ignoredError = value;
			return this;
		}

		/**
		 * API name: {@code ignored_error}
		 */
		public final Builder ignoredError(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.ignoredError(fn.apply(new ErrorCause.Builder()).build());
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(@Nullable ErrorCause value) {
			this.error = value;
			return this;
		}

		/**
		 * API name: {@code error}
		 */
		public final Builder error(Function<ErrorCause.Builder, ObjectBuilder<ErrorCause>> fn) {
			return this.error(fn.apply(new ErrorCause.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PipelineSimulation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PipelineSimulation build() {
			_checkSingleUse();

			return new PipelineSimulation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PipelineSimulation}
	 */
	public static final JsonpDeserializer<PipelineSimulation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PipelineSimulation::setupPipelineSimulationDeserializer);

	protected static void setupPipelineSimulationDeserializer(ObjectDeserializer<PipelineSimulation.Builder> op) {

		op.add(Builder::doc, DocumentSimulation._DESERIALIZER, "doc");
		op.add(Builder::tag, JsonpDeserializer.stringDeserializer(), "tag");
		op.add(Builder::processorType, JsonpDeserializer.stringDeserializer(), "processor_type");
		op.add(Builder::status, ActionStatusOptions._DESERIALIZER, "status");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::ignoredError, ErrorCause._DESERIALIZER, "ignored_error");
		op.add(Builder::error, ErrorCause._DESERIALIZER, "error");

	}

}
