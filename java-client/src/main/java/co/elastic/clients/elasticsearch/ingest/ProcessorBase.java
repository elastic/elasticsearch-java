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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest._types.ProcessorBase

public abstract class ProcessorBase implements JsonpSerializable {
	@Nullable
	private final String if_;

	@Nullable
	private final Boolean ignoreFailure;

	private final List<Processor> onFailure;

	@Nullable
	private final String tag;

	// ---------------------------------------------------------------------------------------------

	protected ProcessorBase(AbstractBuilder<?> builder) {

		this.if_ = builder.if_;
		this.ignoreFailure = builder.ignoreFailure;
		this.onFailure = ModelTypeHelper.unmodifiable(builder.onFailure);
		this.tag = builder.tag;

	}

	/**
	 * API name: {@code if}
	 */
	@Nullable
	public final String if_() {
		return this.if_;
	}

	/**
	 * API name: {@code ignore_failure}
	 */
	@Nullable
	public final Boolean ignoreFailure() {
		return this.ignoreFailure;
	}

	/**
	 * API name: {@code on_failure}
	 */
	public final List<Processor> onFailure() {
		return this.onFailure;
	}

	/**
	 * API name: {@code tag}
	 */
	@Nullable
	public final String tag() {
		return this.tag;
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

		if (this.if_ != null) {
			generator.writeKey("if");
			generator.write(this.if_);

		}
		if (this.ignoreFailure != null) {
			generator.writeKey("ignore_failure");
			generator.write(this.ignoreFailure);

		}
		if (ModelTypeHelper.isDefined(this.onFailure)) {
			generator.writeKey("on_failure");
			generator.writeStartArray();
			for (Processor item0 : this.onFailure) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.tag != null) {
			generator.writeKey("tag");
			generator.write(this.tag);

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				ObjectBuilderBase {
		@Nullable
		private String if_;

		@Nullable
		private Boolean ignoreFailure;

		@Nullable
		private List<Processor> onFailure;

		@Nullable
		private String tag;

		/**
		 * API name: {@code if}
		 */
		public final BuilderT if_(@Nullable String value) {
			this.if_ = value;
			return self();
		}

		/**
		 * API name: {@code ignore_failure}
		 */
		public final BuilderT ignoreFailure(@Nullable Boolean value) {
			this.ignoreFailure = value;
			return self();
		}

		/**
		 * API name: {@code on_failure}
		 */
		public final BuilderT onFailure(@Nullable List<Processor> value) {
			this.onFailure = value;
			return self();
		}

		/**
		 * API name: {@code on_failure}
		 */
		public final BuilderT onFailure(Processor... value) {
			this.onFailure = Arrays.asList(value);
			return self();
		}

		/**
		 * API name: {@code on_failure}
		 */
		@SafeVarargs
		public final BuilderT onFailure(Function<Processor.Builder, ObjectBuilder<Processor>>... fns) {
			this.onFailure = new ArrayList<>(fns.length);
			for (Function<Processor.Builder, ObjectBuilder<Processor>> fn : fns) {
				this.onFailure.add(fn.apply(new Processor.Builder()).build());
			}
			return self();
		}

		/**
		 * API name: {@code tag}
		 */
		public final BuilderT tag(@Nullable String value) {
			this.tag = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupProcessorBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::if_, JsonpDeserializer.stringDeserializer(), "if");
		op.add(AbstractBuilder::ignoreFailure, JsonpDeserializer.booleanDeserializer(), "ignore_failure");
		op.add(AbstractBuilder::onFailure, JsonpDeserializer.arrayDeserializer(Processor._DESERIALIZER), "on_failure");
		op.add(AbstractBuilder::tag, JsonpDeserializer.stringDeserializer(), "tag");

	}

}
