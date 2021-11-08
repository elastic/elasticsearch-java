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

package co.elastic.clients.elasticsearch.rollup;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponseBase;
import co.elastic.clients.elasticsearch.rollup.delete_job.TaskFailure;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup.delete_job.Response
@JsonpDeserializable
public class DeleteJobResponse extends AcknowledgedResponseBase {
	private final List<TaskFailure> taskFailures;

	// ---------------------------------------------------------------------------------------------

	private DeleteJobResponse(Builder builder) {
		super(builder);

		this.taskFailures = ModelTypeHelper.unmodifiable(builder.taskFailures);

	}

	public static DeleteJobResponse of(Function<Builder, ObjectBuilder<DeleteJobResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code task_failures}
	 */
	public final List<TaskFailure> taskFailures() {
		return this.taskFailures;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.taskFailures)) {
			generator.writeKey("task_failures");
			generator.writeStartArray();
			for (TaskFailure item0 : this.taskFailures) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteJobResponse}.
	 */
	public static class Builder extends AcknowledgedResponseBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<DeleteJobResponse> {
		@Nullable
		private List<TaskFailure> taskFailures;

		/**
		 * API name: {@code task_failures}
		 */
		public final Builder taskFailures(@Nullable List<TaskFailure> value) {
			this.taskFailures = value;
			return this;
		}

		/**
		 * API name: {@code task_failures}
		 */
		public final Builder taskFailures(TaskFailure... value) {
			this.taskFailures = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code task_failures}
		 */
		@SafeVarargs
		public final Builder taskFailures(Function<TaskFailure.Builder, ObjectBuilder<TaskFailure>>... fns) {
			this.taskFailures = new ArrayList<>(fns.length);
			for (Function<TaskFailure.Builder, ObjectBuilder<TaskFailure>> fn : fns) {
				this.taskFailures.add(fn.apply(new TaskFailure.Builder()).build());
			}
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DeleteJobResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteJobResponse build() {
			_checkSingleUse();

			return new DeleteJobResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DeleteJobResponse}
	 */
	public static final JsonpDeserializer<DeleteJobResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DeleteJobResponse::setupDeleteJobResponseDeserializer, Builder::build);

	protected static void setupDeleteJobResponseDeserializer(DelegatingDeserializer<DeleteJobResponse.Builder> op) {
		AcknowledgedResponseBase.setupAcknowledgedResponseBaseDeserializer(op);
		op.add(Builder::taskFailures, JsonpDeserializer.arrayDeserializer(TaskFailure._DESERIALIZER), "task_failures");

	}

}
